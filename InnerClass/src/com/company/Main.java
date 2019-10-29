package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1,112.3);
//        System.out.println(first.driveSpeed(224));


        mcLaren.operateClutch(true);

        mcLaren.changeGear(1);

        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(229));
        mcLaren.changeGear(2    );
        System.out.println(mcLaren.wheelSpeed(23));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(24244));





    }
}
