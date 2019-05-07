package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Raven feelings= new Raven();
	Scanner input= new Scanner(System.in);
        System.out.println("Good Afternoon! ");

        String userInput=" ";
        boolean userQuit=false;
        String Elizasays= " ";
        System.out.println("How are you today? (respond Q to quit)");
        while (!userQuit){

            userInput= input.nextLine();
            if (userInput.contains(feelings.addWords(userInput))){
                System.out.println(feelings.elizaResponse());
            }

            if(userQuit= feelings.quitCommand(userInput)){
                System.out.println("Thank you for chatting with me!");
                break;
            }
            System.out.println();

        }

    }
}
