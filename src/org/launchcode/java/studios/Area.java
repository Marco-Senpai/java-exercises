package org.launchcode.java.studios;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Area {
    public static void main(String[] args) {
        System.out.println("What is the Radius? ");
        Scanner radius = new Scanner(System.in);
        double numRadius = radius.nextDouble();
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("numRadius: " + df.format(numRadius));

        if (numRadius < 0) {
            System.out.println("Radius must be positive number! ");
        } else {
            System.out.println("The area is " + 3.14 * numRadius * numRadius);


        }




    }

}
