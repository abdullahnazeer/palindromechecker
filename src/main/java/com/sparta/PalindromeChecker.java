package com.sparta;

import java.util.Arrays;

public class PalindromeChecker {

    public void checkStringWord(String string) {

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        System.out.println(reversedString);

        if (string.equals(reversedString)) {
            System.out.println("This string is a palindrome!");
        } else {
            System.out.println("This string is not a palindrome!");
        }

    }

    public void checkStringNotCaseSensitive(String string) {

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.toLowerCase().charAt(i);
        }

        System.out.println(reversedString);

        if (string.toLowerCase().equals(reversedString)) {
            System.out.println("This string is a palindrome!");
        } else {
            System.out.println("This string is not a palindrome!");
        }

    }

    public void checkStringArray(String[] stringArray) {

        int totalPalindromes = 0;

        for (String string : stringArray) {

            String reversedString = "";

            for (int i = string.length() - 1; i >= 0; i--) {
                reversedString += string.toLowerCase().charAt(i);
            }

            if (string.equals(reversedString)) {
                System.out.println("Element " + (Arrays.asList(stringArray).indexOf(string) + 1) +
                        " of array contains a palindrome: " + string);
                totalPalindromes += 1;
            }

        }

        if (totalPalindromes == 0) {
            System.out.println("The array does not contain any palindromes!");
        }

    }

}
