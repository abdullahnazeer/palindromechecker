package com.sparta;

public class Main {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        // checking if a word is a palindrome (case-sensitive)
        checker.checkStringWord("noon");

        // checking if a string is a palindrome (not case-sensitive, spaces are considered)
        checker.checkStringNotCaseSensitive("! no!on !");

        // checking if a string is a palindrome (not case-sensitive, spaces are considered)
        checker.checkStringNotCaseSensitive("Noon");

        // checking if an array of strings contains any palindromes (not case-sensitive, spaces are considered)
        checker.checkStringArray(new String[]{"Noon", "Abdullah", "radar", "reviver", "lollipop", "civic", "s civic s"});

    }
}