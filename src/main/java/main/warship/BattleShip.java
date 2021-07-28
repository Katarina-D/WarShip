package main.warship;

public abstract class BattleShip extends Ship {
    private int damage;

    
    public int getDamage() {
       return this.damage;
    }
   
    public void setDamage(int damage) {
       this.damage = damage;
    }
   
    public void attack(Ship ship) {
        System.out.println("Napad " + this.getName() + " na " + ship.getName() + ":");
        
        ship.getDamage(this.damage);
        
        if (ship.getHealt() >= 0) {
           System.out.println("Sada 'health' za " + ship.getName() + " je: " + ship.getHealt());
           System.out.println("");
        }
    }
    
    @Override
    public void print() {
        if (this.getShield() > 0) {
            System.out.println(this.getName() + ": damage "   + this.getDamage() + ", health " + this.getHealt() + ", shield " + this.getShield());
        } else {
            System.out.println(this.getName() + ": damage "   + this.getDamage() + ", health " + this.getHealt());
        }
        
    }
}
