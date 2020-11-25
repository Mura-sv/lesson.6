package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setName("Boss");
        boss.setDamage(50);
        boss.setHealth(1000);

        Weapon  weapon= new Weapon("Special","club ");
        boss.setBossWeapon(weapon);

        System.out.println(boss.getName());
        System.out.println("Heath: "+boss.getHealth());
        System.out.println("Damage: "+boss.getDamage());
        System.out.println("Weapon name: "+boss.getBossWeapon().getWeaponName()+" Weapon type: "+boss.getBossWeapon().getWeaponType());



    }
}
