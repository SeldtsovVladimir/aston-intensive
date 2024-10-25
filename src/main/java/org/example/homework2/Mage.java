package org.example.homework2;

public class Mage extends Hero {
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + "испоьзовал магию на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
