package main.warship;

public abstract class Ship {
    
    private int healt;
    private int speed;
    private String name;
    private int shield;

    
    public int getHealt() {
        return this.healt;
    }
    
    public void setHealt(int healt) {
        this.healt = healt;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getShield() {
        return this.shield;
    }
    
    public void setShield(int shield) {
        this.shield = shield;
    }
    
    public void getDamage(int damage) {
        this.setHealt(this.getHealt() - damage);
        
        if (healt < 0) {
            System.out.println(this.getName() + " je unisten.");
        }
    }
    
    public abstract void print();   
    
   
        
    
}
