package com.chevonphillip;

public class Main {
    public static void main(String[] args) {
        // Primitive Types

        int[] myArray = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        System.out.println("For Loop");
        for (int i : myArray) {
            System.out.println(i);
        }

        System.out.println("While Loop");
        int index = 0;

        while (index < myArray.length) {
            System.out.println(myArray[index]);
            index++;
        }

//        do {
//            System.out.println(myArray[index - 1]);
//            index++;
//        } while (index < myArray.length);

        int[] grades = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        for (int grade : grades) {
            switch (grade) {
                case 100 -> System.out.println("You got a perfect score!");
                case 90 -> System.out.println("You got an A!");
                case 80 -> System.out.println("You got a B!");
                case 70 -> System.out.println("You got a C!");
                case 60 -> System.out.println("You got a D!");
                default -> System.out.println("You got an F!");
            }
        }


    }
}