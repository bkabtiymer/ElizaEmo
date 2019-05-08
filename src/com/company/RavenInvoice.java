package com.company;

import java.util.Scanner;

public class RavenInvoice {

    public RavenInvoice(){}
    Scanner input=new Scanner(System.in);
    private double tot;
    private double total1;
    private double total2;
    private double price1=100;
    private double price2=0.35;
    private int quantity1=1;
    private int quantity2=0;
    String first="Session";
    String second="Questions";
//    double quantity[]={1,10};
//    double price[]={100,0.35};


     public void calcTotal(int questionNum){
         quantity2=questionNum;
         total1 = quantity1 * price1;
            System.out.println(total1);
            total2 = questionNum * price2;
            System.out.println(questionNum);
            tot=total1+total2;
        }

     public void description(boolean answer) {
         if (answer) {
             System.out.println("Items:");
             System.out.println("Quantity\tDescription\tPrice\tTotal");
             System.out.println(quantity1 + "\t\t\t" + first + "\t\t" + price1 + "\t" + total1);
             System.out.println(quantity2 + "\t\t\t" + second + "\t" + price2 + "\t" + total2);
             System.out.println("\t\t\t\t\t\t\t\t\t" + tot);
         }
//         return inVoice;
     }



}
