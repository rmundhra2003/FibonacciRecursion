package com.company;
import java.util.ArrayList;
import java.util.Scanner;
/*
    By definition, the first two numbers in the Fibonacci sequence are either 1 and 1, or 0 and 1, depending on the
    chosen starting point of the sequence, and each subsequent number is the sum of the previous two.

    Wrote a recursive method to create a Fibonacci sequence of 20 numbers.

    Sample output: Enter the starting number for Fibonnacci sequence: 0
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
 */
public class Main {
    static ArrayList<Integer> intArray = new ArrayList<Integer>();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	    //Prompt for starting number for Fibonnacci sequence
        System.out.print("Enter the starting number for Fibonnacci sequence: ");
        int number = keyboard.nextInt();
        keyboard.nextLine();

        //Call method to compute Fibonnacci
        intArray.add(number);
        getFibonnacci(number, number, 1);
        //print the fibonnacci
        int loop = 0;
        for(Integer num:intArray) {
            if(loop != 0)
                System.out.print(", ");
            System.out.print("" + num.toString());
            loop++;

        }

    }
    //Recursive method to print Fibonnacci
    static void getFibonnacci(int origin, int start, int iter) {
        if(iter >= 20)
            return;
        else if(iter == 1) {
            intArray.add(start+1);
        }
        else {
            //Add the integer to intArray
            intArray.add(start);
        }
        int index = intArray.size();
        try {
            int num = intArray.get(index - 1) + intArray.get(index - 2);
            //Call the
            getFibonnacci(origin, num, ++iter);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }finally {

        }

    }
}
