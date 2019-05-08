package com.company;

import java.util.HashMap;
import java.util.Random;

public class Raven {
    public Raven() {

    }

    //Populate array of possible positive and negative responses
    String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative", "grateful", "giddy", "yay", "fine"};

    String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid", "disappointed", "mad", "help"};
    //Place a counter to record every positive and negative response
    int counterPos = 0, counterNeg = 0;//Starts the counter at zero
    int counter2=0;
    RavenInvoice invoice=new RavenInvoice();
    public String addWords(String str) {
        String words[] = str.split(" ");//Splits user response to be recognized individually by words
        String addWd = " ";
        for (String word : words) {

            for (String positiveRes : positive)//Initializes positive array
            {
                if (positiveRes.equalsIgnoreCase(word))//if user input equals a value in the array..
                {
                    counterPos++;//Add one to the positive counter
                    addWd = positiveRes;//Take the user input value and add  to String addWd

                }
            }
            for (String negativeRes : negative) {
                if (negativeRes.equalsIgnoreCase(word))//Same as positive if-Statement
                {
                    counterNeg++;
                    addWd = negativeRes;
                }
            }
        }

        return addWd;//print addWd

    }


    public boolean quitCommand(String response) {
        boolean quit = false;
        if (response.equalsIgnoreCase("Q"))//if the user types in Q or q
        {
            quit = true;
        }
        return quit;
    }

    public String elizaResponse() {

        String response = "";//Initialized response variable
        if (counterPos > counterNeg)//if the sum of positive counter is greater than sum of Negative counter
        {
            response = responsePos();//response variable will output a set of pre-defined responses from the responsePos method
            counter2++;
        } else if (counterPos == counterNeg) {
            response = "Meh.";
            counter2++;
        } else if (counterPos < counterNeg)//if the negative counter is higher
        {
            response = responseNeg();
            counter2++;
        }
        return response;
    }

    public String responsePos() {
//        input an array for Raven's possible response to the user's statements
        String positive[] = {"Please tell me more!", "It seems like you're having a good day!", "Awesome! How did that make you feel?", "You're killing it!", "You are a star today :)"};
        Random rand = new Random();
        int answer = rand.nextInt(positive.length);//randomly pick an index number (out of 5) of Raven's responses
        return positive[answer];//print out value of index picked
    }

    public String responseNeg() {
        String negative[] = {"Sorry to hear that", "How can I help?", "Have you been feeling this all day?", "Did you get to talk with someone about it?", "You know I'm here for you."};
        Random rand = new Random();
        int answer = rand.nextInt(negative.length);
        return negative[answer];
    }

}
