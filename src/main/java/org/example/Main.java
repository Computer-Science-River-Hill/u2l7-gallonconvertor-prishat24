package org.example; //DO NOT DELETE
/*
* Prisha Tiwari
* GallonConverter Code
*/

import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of gallons");
    double gallons = input.nextDouble();
    double quarts = gallons*4;
    double pints = quarts*2;
    double cups= pints*2;
    double tablespoons = cups*16;
    System.out.println("In " + gallons + " gallons there are:");
    System.out.println(quarts + " quarts");
    System.out.println(pints + " pints");
    System.out.println(cups + " cups");
    System.out.println(tablespoons + " tablespoons");




    }
}