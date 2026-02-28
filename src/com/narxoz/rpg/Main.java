package com.narxoz.rpg;

import com.narxoz.rpg.adapter.EnemyCombatantAdapter;
import com.narxoz.rpg.adapter.HeroCombatantAdapter;
import com.narxoz.rpg.battle.BattleEngine;
import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.battle.EncounterResult;
import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.hero.Mage;
import com.narxoz.rpg.hero.Warrior;
import com.narxoz.rpg.enemy.Skeleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("RPG Battle Engine Demo\n");

        Warrior warrior = new Warrior("Nurdaulet");
        Mage mage = new Mage("Kazybek");
        Goblin goblin = new Goblin("Eskendir");
        Goblin goblin2 = new Goblin("Serikbol");
        Skeleton skeleton = new Skeleton("Johny depp");

        //Wrap with adapters
        ArrayList<Combatant> heroes = new ArrayList<>();
        heroes.add(new HeroCombatantAdapter(warrior));
        heroes.add(new HeroCombatantAdapter(mage));

        List<Combatant> enemies = new ArrayList<>();
        enemies.add(new EnemyCombatantAdapter(goblin));
        enemies.add(new EnemyCombatantAdapter(goblin2));
        enemies.add(new EnemyCombatantAdapter(skeleton));
        //Demonstrate Singleton behavior
        BattleEngine engineA = BattleEngine.getInstance();
        BattleEngine engineB = BattleEngine.getInstance();
        System.out.println("Same instance? " + (engineA == engineB));
        System.out.println();

        // TODO: Run battle and print summary
        engineA.setRandomSeed(42L);
        EncounterResult result = engineA.runEncounter(heroes, enemies);

        for (String line : result.getBattleLog()) {
            System.out.println(line);
        }
        System.out.println("Winner:" + result.getWinner());
        System.out.println("Rounds:" + result.getRounds());

        System.out.println("\nDemo Complete");
    }
}
