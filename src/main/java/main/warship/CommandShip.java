package main.warship;

public class CommandShip extends BattleShip {
    
    public final String name = "Command-Ship";
    public final int shield = 20;
    
    CommandShip() {
    }
    
    CommandShip(int damage, int health) {
        this.setDamage(damage);
        this.setHealt(health);
        this.setName(name);
        this.setShield(shield);
    }
    
    @Override
    public void getDamage(int damage) {
        this.setHealt(this.getHealt() - damage + this.getShield());

        if (this.getHealt() < 0) {
            System.out.println(this.getName() + " je unisten.");
        }
    }
}
