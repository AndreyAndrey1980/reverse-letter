import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    @Test
    void keepsNonLettersInPlace() {
        assertEquals("t@eb eht av$J!123", Main.reverseLetters("J@va the be$t!123"));
    }

    @Test
    void returnsEmptyForEmptyInput() {
        assertEquals("", Main.reverseLetters(""));
    }

    @Test
    void returnsSameStringForSingleLetter() {
        assertEquals("a", Main.reverseLetters("a"));
    }

    @Test
    void returnsSameStringWhenNoLetters() {
        assertEquals("123!@$", Main.reverseLetters("123!@$"));
    }

    @Test
    void reversesOnlyLetters() {
        assertEquals("dcba", Main.reverseLetters("abcd"));
    }

    @Test
    void keepsNonLettersAtEdgesAndMiddle() {
        assertEquals("c!b@a", Main.reverseLetters("a!b@c"));
    }

    @Test
    void preservesCaseOfLetters() {
        assertEquals("CbA", Main.reverseLetters("AbC"));
    }

    @Test
    void returnsEmptyForNullInput() {
        assertEquals("", Main.reverseLetters(null));
    }
}