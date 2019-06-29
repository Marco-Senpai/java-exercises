package org.launchcode.java.demos.java4python.exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

//        hello world
        System.out.println("Hello Buddy!");
        System.out.println();
//          what is your name?
//        System.out.println("What's your name? ");

        Scanner name = new Scanner(System.in);
        System.out.println("What's your name? ");
        String user = name.nextLine();
        System.out.println("Howdy, " + user);
        System.out.println();

//        find the area
        System.out.println("What is the length of the rectangle? ");
        Scanner length = new Scanner(System.in);
        Double numLength = length.nextDouble();
        System.out.println();

        System.out.println("What is the width of the rectangle? ");
        Scanner width = new Scanner(System.in);
        Double numWidth = width.nextDouble();
        System.out.println();

        System.out.println("The area is " + numLength * numWidth);
        Scanner scanner = new Scanner(System.in);
        System.out.println();

//        find the word
        String text = "Alice was beginning to get very tired of sitting by " +
            "her sister on the bank, and having nothing to do: once or " +
            "twice she had peeped into the book her sister was reading, " +
            "but it had no pictures or conversations in it, 'and what is " +
            "the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What word or phrase am I looking for? ");
        String searchTerm = scanner.next();
        System.out.println();

        boolean contains = text.contains(searchTerm);
        System.out.println("Contains search term: " + contains);
        System.out.println();

        System.out.println("How many miles you got? ");
        Float miles = scanner.nextFloat();
        System.out.println();

        System.out.println("How many gallons you got? ");
        Float gallons = scanner.nextFloat();
        System.out.println();

        System.out.println("Miles per gallon: " + miles/gallons);
    }



}
