package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        String word;
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(12);
        numList.add(8);
        numList.add(37);
        numList.add(11);
        numList.add(23);
        numList.add(32);
        numList.add(44);
        numList.add(9);
        numList.add(6);
        
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Quick"); wordList.add("Crazy"); wordList.add("Which"); wordList.add("Check");
        wordList.add("Knock"); wordList.add("Happy"); wordList.add("Enjoy"); wordList.add("Dozen");
        wordList.add("Thick"); wordList.add("Shocking"); wordList.add("Seized"); wordList.add("Quoted");
        wordList.add("Quietly"); wordList.add("Major"); wordList.add("Lucky"); wordList.add("Juiced");
        wordList.add("Judged");

        System.out.println(numList);
        System.out.println(sumEven(numList));
        System.out.println(wordList);
        System.out.println(fiveLetterWords(wordList));
    }
            public static int sumEven(ArrayList<Integer> numList) {
                int total = 0;
                for (int integer : numList) {
                    if (integer % 2 == 0) {
                        total += integer;
                    }
                }
                return total;
            }

    public static ArrayList<String> fiveLetterWords(ArrayList<String> wordList) {
        System.out.println("Enter a word length: ");
        Scanner input = new Scanner(System.in);;
        int numChars = input.nextInt();
        ArrayList<String> result = new ArrayList<>();
        for (String word : wordList) {
            if (word.length() == numChars) {
               System.out.println(word);
            }
        }
        return result;
    }
}
