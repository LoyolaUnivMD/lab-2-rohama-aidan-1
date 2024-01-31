// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        DecimalFormat dfmt = new DecimalFormat("$,###");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");

        String customerName = input.nextLine();
        int i;
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

        String[] parts = customerName.split(" ");
        String firstName = parts[0];

        System.out.println("Goodluck "+firstName+"!");
        System.out.println("Estimated Jackpot:");
        System.out.println(dfmt.format(prize));


    }
}
