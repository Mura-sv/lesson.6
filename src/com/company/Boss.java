package com.company;

public class Boss extends GameEntity {
    private Weapon Weapon;

    public Weapon getWeapon() {
        return Weapon;
    }

    public void setWeapon(Weapon bossWeapon) {
        this.Weapon = bossWeapon;
    }

    public String printInfo() {
        return "Name: " + getName() + " Health: " + getHealth() + " Damage: " + getDamage() + " Weapon name " + getWeapon().getWeaponName() + " Weapon type: " + getWeapon().getWeaponType();
    }
}