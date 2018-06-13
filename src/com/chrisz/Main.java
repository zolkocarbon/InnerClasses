package com.chrisz;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true); // engage clutch
        mcLaren.changeGear(1);  // shift into first
        mcLaren.operateClutch(false);// disengage clutch
        System.out.println("Current speed is " + mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2); // clutch isn't in, shifted into neutral
        System.out.println("Current speed is " + mcLaren.wheelSpeed(1000)); // 0
    }
}
