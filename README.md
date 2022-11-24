# Palindrome Checker

A simple palindrome checker built using Java.

## Project Description

A simple Java program which contains several methods for determining whether or not an input (a word, a sentence or an
array of sentences) fits the definition of being a palindrome.

### Executing program

The program runs on a CLI - can be run on any Java IDE.

## Explanation of Code

The following segment of code shows the main class. An instance of the PalindromeChecker class is created, and the
various methods are called.

```
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
```

The following segment of code shows the first method in the PalindromeChecker class. It takes in a string as an input
and checks whether or not it is a palindrome. This method is case-sensitive.

```
public String checkStringWord(String string) {

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

//        System.out.println(reversedString);

        if (string.equals(reversedString)) {
            return "This string is a palindrome!";
        } else {
            return "This string is not a palindrome!";
        }

    }
```

The following two methods contain the logic for the following:

* determining whether or not a word is a palindrome (not case-sensitive).
* extracting the list of palindromes present within an array of strings.

```
public String checkStringNotCaseSensitive(String string) {

    String reversedString = "";

    for (int i = string.length() - 1; i >= 0; i--) {
        reversedString += string.toLowerCase().charAt(i);
    }

//        System.out.println(reversedString);

    if (string.toLowerCase().equals(reversedString)) {
        return "This string is a palindrome!";
    } else {
        return "This string is not a palindrome!";
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
```

## End of Document
