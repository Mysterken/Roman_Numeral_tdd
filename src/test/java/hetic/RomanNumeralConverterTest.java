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

    @Test
    public void testFifty() {
        assertEquals("L", converter.convertToRoman(50));
    }

    @Test
    public void testFour() {
        assertEquals("IV", converter.convertToRoman(4));
    }

    @Test
    public void testNine() {
        assertEquals("IX", converter.convertToRoman(9));
    }

    @Test
    public void testTwenty() {
        assertEquals("XX", converter.convertToRoman(20));
    }

    @Test
    public void testThirty() {
        assertEquals("XXX", converter.convertToRoman(30));
    }

    @Test
    public void testForty() {
        assertEquals("XL", converter.convertToRoman(40));
    }
}