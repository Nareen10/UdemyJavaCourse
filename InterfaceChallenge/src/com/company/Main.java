package com.company;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

>>>>>>> 4a6c6b60bd24a5542d801f411174398b640fd5bd
public class Main {

    public static void main(String[] args) {
	// write your code here
<<<<<<< HEAD
    }
=======

//
//        Player tim = new Player ("Tim", 10, 15);
//        tim.toString();
//        saveObject(tim);
//
//        tim.setHitPoint(9);
//        System.out.println(tim);
//
//        tim.setWeapon("Stormbringer");
//        saveObject(tim);
//
//        loadObject(tim);
//        System.out.println(tim);
//

        ISaveable werewolf = new Monster("Werewolf", 14,25);

        saveObject(werewolf);
        System.out.println(werewolf);

        loadObject(werewolf);
        System.out.println(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index =0;
        System.out.println("Choose \n" +
                           "1 to enter String \n" +
                           "0 to quit ");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.print("Enter a String: ");
                    String stringInput =scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }

        }

        return values;
    }


    public static void saveObject (ISaveable objectToSave) {

        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }

    }

    public static void loadObject (ISaveable objectToLoad){

        List<String> values = readValues();
        objectToLoad.read(values);

    }



>>>>>>> 4a6c6b60bd24a5542d801f411174398b640fd5bd
}
