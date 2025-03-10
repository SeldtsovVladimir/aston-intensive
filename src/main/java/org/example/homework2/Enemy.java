package org.example.homework2;

public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage){
            health=0;
            System.out.println(getName() + " умер ");
        }else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " Получил урон " + damage + " Осталось " + health);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
