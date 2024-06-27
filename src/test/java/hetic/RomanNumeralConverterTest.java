package hetic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testOne() {
        assertEquals("I", converter.convertToRoman(1));
    }

    @Test
    public void testTen() {
        assertEquals("X", converter.convertToRoman(10));
    }

    @Test
    public void testSeven() {
        assertEquals("VII", converter.convertToRoman(7));
    }
}