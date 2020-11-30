package com.company;

public class Main {

    public static void main(String[] args) {
Boss boss = new Boss();
boss.setHealth(200);
boss.setDamage(50);
boss.setSkill("allMight");
Weapon weapon = new Weapon();
weapon.setName("sword");
weapon.setType("strong");
boss.setWeaponOfBoss(weapon);
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getSkill() + " " + boss.getWeaponOfBoss().getName()
        + " " + boss.getWeaponOfBoss().getType());
    }

}
