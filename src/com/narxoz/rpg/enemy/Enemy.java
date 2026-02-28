package com.narxoz.rpg.enemy;

public interface Enemy {
    String getTitle();
    int getDamage();
    void applyDamage(int amount);
    boolean isDefeated();
    double checkCriticalChance();
    int getAggroValue();
    int getHealth();
}
