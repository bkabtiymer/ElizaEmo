package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Raven feelings= new Raven();
	RavenInvoice invoice= new RavenInvoice();
	Scanner input= new Scanner(System.in);
        ArrayList<String> chatHistory= new ArrayList<>();//created an arrayList to record chat history
        String greeting= "Good Afternoon!";
        System.out.println(greeting);
        chatHistory.add(greeting);//Add Raven's greeting to arraylist
        String userInput=" ";
        boolean userQuit=false;
        String firstQ="How are you today? (respond Q at any point to quit)";
        System.out.println(firstQ);
        chatHistory.add("Raven: "+firstQ);//Record Raven's question and add to arrayList
        while (!userQuit)//While the user doesn't want to quit..
        {
            userInput= input.nextLine();//accept user input
//            if the word the use entered is in feelings(varName for Raven class), addWords(method in the Raven class)..
            if (userInput.contains(feelings.addWords(userInput)))
            {
               String userResponse=feelings.elizaResponse();//refer to the elizaResponse method in the Raven class
                System.out.println(userResponse);
                chatHistory.add("User: "+userInput);//adds user's input to the arrayList chatHistory
                chatHistory.add("Raven: "+userResponse);//adds Raven's response to chatHistory
            }

            if(userQuit= feelings.quitCommand(userInput))//if the user wants to quit, refer to the quitCommand method in the Raven class
            {
                String byeGreeting="Thank you for chatting with me!";
                chatHistory.add("User: "+userInput);
                System.out.println(byeGreeting);
                chatHistory.add("Raven: "+byeGreeting);
                break;
            }

        }
        System.out.println("\n-----------------------------------------------------------");
        System.out.println(" Summary of Chat");
        for (String printOut: chatHistory)//for-loop to collect all values for chatHistory
        {
            System.out.println(printOut);//print-out conversation between Ravena and user.
        }
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Would you like an Invoice? (y/n)");
        String answerRepo= input.nextLine();
         if (answerRepo.equalsIgnoreCase("y")){
             invoice.calcTotal(feelings.counter2);
             invoice.description(true);
         }else{
             System.out.println("Thank you for visiting!");
         }
    }
}
