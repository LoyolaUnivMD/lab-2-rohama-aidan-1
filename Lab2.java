// Programmers:  Rohama and Aidan
// Course:  CS 212
// Due Date: 2/4/2024
// Lab Assignment: 2
// Problem Statement: To use the Java predefined classes to write a program that can generate lottery tickets
// Data In: Name, amount to play
// Data Out: Lottery numbers, estimated jackpot

//Import packages
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
//      Make the Scanner object
        Scanner input = new Scanner(System.in);
        DecimalFormat dfmt = new DecimalFormat("$,###");

        // State purpose of program
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        // Get inputs
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        System.out.println("How much do you want to play?");
        int inAmount = input.nextInt();

        //Set winning numbers to an array
        int[] winningNums =  {3, 5, 16, 58, 59, 11};

        //Loop through each column of lottery numbers
        for(int i=0; i<10; i++){
            String lotteryNumbers = "";

            //Loop through each row of lottery numbers
            for(int c=0; c<6; c++){

                //Make the random lottery number
                Random rand = new Random();
                int intNumber = rand.nextInt(99);
                String stringNumber = String.valueOf(intNumber);

                //Check if the number generated is a winning number by looping through the array of winning numbers
                for (int d = 0; d < 6; d++){
                    if(intNumber == winningNums[d]) {
                        inAmount = (int) Math.pow(inAmount,1.75);
                    }
                }

                //Check if a "0" needs to be added to the numbers to make aesthetically pleasing
                if(intNumber < 10){
                    stringNumber = "0"+stringNumber;
                }

                //Concatenate lottery numbers for the output
                lotteryNumbers = lotteryNumbers + stringNumber + " ";
            }
            //Output lottery numbers
            System.out.println(lotteryNumbers);
        }
        int prize = inAmount;

        //Make the players name an array that can be separated into first and last
        String[] names = customerName.split(" ");
        String firstName = names[0];

        //Output info
        System.out.println("Goodluck "+firstName+"!");
        System.out.println("Estimated Jackpot:");
        System.out.println(dfmt.format(prize));


    }
}
