package main.warship;

public class BigCargo extends Cargo {
    
    public final String name = "Big-Cargo";

    
    BigCargo() {
    }
    
    BigCargo(int health, int capacity, int shield) {
        this.setHealt(health);
        this.setCapacity(capacity);
        this.setShield(shield);
        this.setName(name);
    }
    
    @Override
    public void getDamage(int damage) {
        this.setHealt(this.getHealt() - damage + this.getShield());
        
        if (this.getHealt() < 0) {
            System.out.println(this.getName() + " je unisten.");
        }
    }
}
