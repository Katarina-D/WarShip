package main.warship;

public class SmallCargo extends Cargo {
    
    public final String name = "Small-Cargo";
    
    SmallCargo() {
    }
    
    SmallCargo(int health, int capacity) {
        this.setHealt(health);
        this.setCapacity(capacity);
        this.setName(name);
    }
    
}
