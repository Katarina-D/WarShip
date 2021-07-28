package main.warship;

public abstract class Cargo extends Ship {
    private int capacity;

    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void print() {
        if (this.getShield() > 0) {
           System.out.println(this.getName() + ": Health " + this.getHealt() + ", Capacity " + this.getCapacity() + ", shield " + this.getShield()); 
        } else {
           System.out.println(this.getName() + ": Health " + this.getHealt() + ", Capacity " + this.getCapacity());
        }
        
    }
    
}
