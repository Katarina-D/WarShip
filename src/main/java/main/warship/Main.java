package main.warship;

public class Main {

    public static void main(String[] args) {
        
        // Detalji o borbenim brodovima:
        System.out.println("Detalji o vojnim brodovima:");
        SmallShip smallShip = new SmallShip(50, 300);
        smallShip.print();
        
        BigShip bigShip = new BigShip(100, 500);
        bigShip.print();
        
        CommandShip commandShip = new CommandShip(150, 1000);
        commandShip.print();
        System.out.println("");
        
        bigShip.attack(smallShip);
        
        smallShip.attack(bigShip);
        
        bigShip.attack(commandShip);
         
        
        // Detalji o Cargo:
        System.out.println("Detalji o Cargo:");
        SmallCargo smallCargo = new SmallCargo(100, 1000);
        smallCargo.print();
        
        BigCargo bigCargo = new BigCargo(200, 5000, 10);
        bigCargo.print();
        System.out.println("");
        
        commandShip.attack(smallCargo);
        
        commandShip.attack(bigCargo);
        
    }
    
}
