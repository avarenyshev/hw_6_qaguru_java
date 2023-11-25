package lesson;

import java.util.ArrayList;
import java.util.List;

public class OOPMain {
    public static void main(String[] args) {
        Human alex = new Human(33, "Alex", true);
        Human oleg = new Human(30, "Oleg", true);


        int newAge = 10;
         alex = alex.incrementAge(newAge);
         //System.out.println("newAge var: " + newAge);

        List<String> hoobbies = new ArrayList<>();
        hoobbies.add("play video games");
        hoobbies.add("football");

        //alex.printHobbies(hoobbies);
        //System.out.println("hobbies var" + hoobbies);

        int[] intArrayFirst = new int[] {10, 20, 200};
        int[] intArraySecond = new int[] {50, 70, 300};

        int[][] array2 = new int[][] {intArrayFirst, intArraySecond};

        for (int i = 0; i < intArrayFirst.length; i++){
            System.out.println("Element with index: " + i + ": " + intArrayFirst[i]);
        }

//        for (int element : intArrayFirst) {
//            System.out.println("Element: " + element);
//        }
        int i = intArrayFirst.length - 1;
        while (i >= 0) {
            System.out.println("Element with index: " + i + ": " + intArrayFirst[i]);

            i--;


        }
//        String[] strArray = new String[] {"Alex", "Oleg","Pedro"};









        //System.out.println(alex);
    }
}
