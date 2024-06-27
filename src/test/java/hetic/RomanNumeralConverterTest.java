package hetic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    // todo : get converter class

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