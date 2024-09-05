package org.launchcode;

import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {
        String str = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word you want to search from the sentence : ");
        String searchWord = input.nextLine();
        int lengthOfTheWord = searchWord.length();
        int indexOfTheWord = str.indexOf(searchWord);

        if(str.toLowerCase().contains(searchWord.toLowerCase())) {
            System.out.println("Word found");
            System.out.println("Length of the word is : " + lengthOfTheWord);
            System.out.println("Index of the word is : " + indexOfTheWord);
        }
        else {
            System.out.println("Word not found");
        }
        String modifiedStr = str.replace(searchWord, "");
        System.out.println(modifiedStr);
    }
}