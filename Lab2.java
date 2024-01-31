// Programmers:  Aidan and Rohama
// Course:  CS 212
// Due Date: 2/04
// Lab Assignment: lab 2
// Problem Statement: Print 10 random lottery tickets for the user
// Data In: user name
// Data Out: lottery tickets and estimated price
// Credits: Notes and stack over flow website

// imported scanner decimal format and random
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        // changed price int to decimal format
        DecimalFormat dfmt = new DecimalFormat("$,###");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        // asking for userinput
        System.out.print("What's your name? ");

        String customerName = input.nextLine();
        int i;
        // looping through lottery numbers
        for(i=0; i<10; i++){
            String lotteryNumbers = "";
            int c = 0;
            for(c=0; c<6; c++){
                Random rand = new Random();
                int intNumber = rand.nextInt(99);
                String stringNumber = String.valueOf(intNumber);
                if(intNumber < 10){
                    stringNumber = "0"+stringNumber;
                }
                lotteryNumbers = lotteryNumbers + stringNumber + " ";
            }
            System.out.println(lotteryNumbers);
        }
        // split customer name in to parts
        String[] parts = customerName.split(" ");
        String firstName = parts[0];
        // output every thing
        System.out.println("____________________");
        System.out.println("Goodluck "+firstName+"!");
        System.out.println("Estimated Jackpot:");
        System.out.println(dfmt.format(prize));
        System.out.println("____________________");


    }
}
