package com.sparta;

public class Main {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        // checking if a word is a palindrome (case-sensitive)
        System.out.println(checker.checkStringWord("noon"));

        // checking if a string is a palindrome (not case-sensitive, spaces are considered)
        System.out.println(checker.checkStringNotCaseSensitive("! no!on !"));

        // checking if a string is a palindrome (not case-sensitive, spaces are considered)
        System.out.println(checker.checkStringNotCaseSensitive("Noon"));

        // checking if an array of strings contains any palindromes (not case-sensitive, spaces are considered)
        checker.checkStringArray(new String[]{"Noon", "Abdullah", "radar", "reviver", "lollipop", "civic", "s civic s"});

    }
}