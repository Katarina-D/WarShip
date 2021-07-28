package main.warship;

public class BigShip extends BattleShip {
    
    public final String name = "Big-ship";
    
    BigShip() {
    }
    
    BigShip(int damage, int health) {
        this.setDamage(damage);
        this.setHealt(health);
        this.setName(name);
    }
    
}
