package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to count characters:");
        String userString = input.nextLine();

        userString = userString.replaceAll("[^a-zA-Z0-9]", "");
        userString = userString.toLowerCase();
//        String myString = "If the product of two terms is zero then common sense says at least one of the two terms " +
//                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
//                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once" +
//                " you’ve done that, it’s pretty straightforward from there.";
        //int l = myString.length();
        Integer charCount;
        char character;

        HashMap<Character, Integer> characterCounts = new HashMap<>();
        for (int i = 0; i < userString.length(); i++){
            character = userString.charAt(i);
            if (characterCounts.containsKey(character)) {
                charCount = characterCounts.get(character);
                charCount++;
                characterCounts.replace(character, charCount);
            } else {
                characterCounts.put(character, 1);
            }
        }
        for (Character key : characterCounts.keySet()) {
            System.out.println(key + " : " +characterCounts.get(key));
        }
//        char[] charactersInString = myString.toCharArray();
////
//        for (int i = 0; i < myString.length(); i++) {
//            characterCount = 1;
//            for (int j = i+1; j < myString.length(); j++){
//                if (charactersInString[i] == charactersInString[j]) {
//                    characterCount++;
//                            for (int k = j; k < (myString.length() - 1); k++) {
//                                charactersInString[k] = charactersInString[k+1];
//                            }
//                     l--;
//                }
//            }
//            System.out.println(charactersInString[i] + ": " + characterCount);
//        }
        }
}
