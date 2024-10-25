package org.example.homework2;


public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("ORC ", 10);
        Hero archer = new Archer("ELF ", 15);
        Hero mage = new Mage("WITCHER ", 5);

        Enemy enemy = new Enemy("Нежить", 100);

        attackEnemy(enemy, warrior, mage, archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero :heroes){
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}