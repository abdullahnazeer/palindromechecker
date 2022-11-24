import com.sparta.Main;
import com.sparta.PalindromeChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCheckerTest {

    @Test
    @DisplayName("Given the word racecar, return This string is a palindrome!")
    public void GivenWordRaceCar_ReturnPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        // Arrange
        String word = "racecar";
        String expectedResult = "This string is a palindrome!";
        // Act
        String result = checker.checkStringWord(word);
        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given the word raCecar, return This string is a palindrome!")
    public void GivenWordRaceCar_ReturnPalindromeNotCaseSensitive() {
        PalindromeChecker checker = new PalindromeChecker();
        // Arrange
        String word = "raCecar";
        String expectedResult = "This string is a palindrome!";
        // Act
        String result = checker.checkStringNotCaseSensitive(word);
        // Assert
        assertEquals(expectedResult, result);
    }
}
