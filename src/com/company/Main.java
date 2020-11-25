package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setName("Boss");
        boss.setDamage(50);
        boss.setHealth(1000);

        Weapon  weapon= new Weapon("W name","W name");
        boss.setBossWeapon(weapon);

        System.out.println(boss.getName());
        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(boss.getBossWeapon());


    }
}
