package main.warship;

public class SmallShip extends BattleShip {
    
    public final String name = "Small-Ship";
   
    SmallShip() {
    }
    
    SmallShip(int damage, int health) {
        this.setDamage(damage);
        this.setHealt(health);
        this.setName(name);
    }
    
    
    
}
