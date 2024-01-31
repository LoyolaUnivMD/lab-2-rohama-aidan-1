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

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");

        String customerName = input.nextLine();
        for(i=0; i<10; i++){
            String lotteryNumbers = "";
            for(c=0; c<6; c++){
                Random rand = new Random();
                int number = rand.nextInt(99);
                    number = rand.nextInt()
            }
        }

        String string = "004-034556";
        String[] parts = string.split("-");
        System.out.println(parts);


    }
}
