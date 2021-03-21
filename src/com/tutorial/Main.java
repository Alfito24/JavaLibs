package com.tutorial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.print("Hello Everyone! Welcome to Travelling's Quiz, Would you like to answer my questions? (Y/N)");
        String answer = scan.next().toUpperCase();
        if (answer.equals("Y")){
            System.out.print("What is your name? ");
            String Name = scan.nextLine();
            System.out.println();
            System.out.print("Thank you " + Name + " for your participating");
            System.out.println();
            System.out.print("How many times you travelling ? ");
            int times = scan.nextInt();
           char size = 'm';




        } else {
            System.out.println("Thank You, We hope soon");
        }

    }
}
