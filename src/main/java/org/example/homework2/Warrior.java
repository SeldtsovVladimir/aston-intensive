package org.example.homework2;

public class Warrior extends Hero{

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + "Ударил мечом по " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
