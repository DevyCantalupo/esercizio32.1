import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final esercizio32di1 testing = new esercizio32di1();

    @Test
    void stringLength_withString() {
        Integer result = testing.stringLength("la");
        assertEquals(2, result);
    }

    @Test
    void stringLength_with_char_and_numbers() {
        Integer result = testing.stringLength("lala");
        assertEquals(4, result);
    }

    @Test
    void stringLengthZero() {
        Integer result = testing.stringLength("lalala");
        assertEquals(6, result);
    }

    @Test
    void stringLengthNull() {
        Integer result = testing.stringLength(null);
        assertNull(result);
    }
}