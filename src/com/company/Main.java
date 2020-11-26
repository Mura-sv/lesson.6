package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setName("Boss");
        boss.setDamage(50);
        boss.setHealth(1000);

        Skelet skelet = new Skelet();
        skelet.setName("Skelet");
        skelet.setDamage(20);
        skelet.setHealth(100);
        skelet.setArrows("30");

        Skelet skelet2 = new Skelet();
        skelet.setName("Skelet #2");
        skelet.setDamage(15);
        skelet.setHealth(110);
        skelet.setArrows("35");

        Weapon weapon = new Weapon("Special", "club ");
        boss.setWeapon(weapon);
        Weapon skeletWeapon = new Weapon("Distant", "Bow");
        skelet.setWeapon(skeletWeapon);
        skelet2.setWeapon(skeletWeapon);

        System.out.println(boss.printInfo());
        System.out.println(skelet.printInfo());
        System.out.println(skelet2.printInfo());
    }
}
