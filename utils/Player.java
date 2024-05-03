package Swiggy_LLD.utils;

public class Player {
    public int health;
    public int strength;
    public int attack;
    public String name;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.health = strength;
    }

    public void setAttack(int attack) {
        this.health = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAttack() {
        return this.attack;
    }

    public String getName() {
        return this.name;
    }
}
