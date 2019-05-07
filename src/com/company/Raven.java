package com.company;

import java.util.HashMap;
import java.util.Random;

public class Raven {
    public Raven() {

    }

    String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

    String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

    int counterPos = 0, counterNeg = 0;

    public String addWords(String str) {
        String words[] = str.split(" ");
        String addWd = " ";
        for (String word : words) {

            for (String positiveRes : positive) {
                if (positiveRes.equalsIgnoreCase(word)){
                    counterPos++;
                    addWd = positiveRes;
//                    addWd = "I am so happy for you, Yay!";
                }
            }
            for (String negativeRes : negative) {
                if (negativeRes.equalsIgnoreCase(word)){
                    counterNeg++;
                    addWd = negativeRes;
                }
            }
        }

        return addWd;
        //this.counterPos=
    }


    public boolean quitCommand(String response) {
        boolean quit = false;
        if (response.equalsIgnoreCase("Q")) {
            quit = true;
        }
        return quit;
    }

    public String elizaResponse() {

        String response = "";
        if (counterPos > counterNeg) {
            response = responsePos();
        } else if (counterPos == counterNeg) {
            response = "Meh.";
        } else if (counterPos < counterNeg) {
            response = responseNeg();
        }
        return response;
    }

    public String responsePos(){
        String positive[]={"Please tell me more!","It seems like you're having a good day!","Thank you your positive feedback"};
        Random rand= new Random();
        int answer= rand.nextInt(positive.length);
        return positive[answer];
    }

    public String responseNeg(){
        String negative[]={"Sorry to hear that","How can I help?","Have you been feeling this all day?"};
        Random rand=new Random();
        int answer= rand.nextInt(negative.length);
        return negative[answer];
    }

}
