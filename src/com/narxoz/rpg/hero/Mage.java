package com.narxoz.rpg.hero;

public class Mage implements Hero {
    private final String name;
    private final int power;
    private double critRate;
    private int health;
    private int aggro;

    public Mage(String name) {
        this.name = name;
        this.power = 25;
        this.health = 80;
        this.critRate = 0.35;
        this.aggro = 2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void receiveDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public double getCritRate() {
        return critRate;
    }

    @Override
    public int getAggrovateDate() {
        return aggro;
    }

}
