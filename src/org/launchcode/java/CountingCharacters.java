package org.launchcode.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner charInput = new Scanner(System.in);
//        String newChar = "";
        System.out.println("Enter your characters!");
        String newChar = charInput.nextLine();
        HashMap<Character, Integer> characters = new HashMap<>();
        char[] charactersInString = newChar.toCharArray();

        for (char c  : charactersInString) {
            if (characters.containsKey(c)) {
                characters.put(c, characters.get(c) + 1);
            } else {
                characters.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> j : characters.entrySet()) {
            System.out.println(j.getKey() + ": " + j.getValue());
        }

    }
}
