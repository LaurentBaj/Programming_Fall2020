import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class toRomanTest {

    obj a = new obj();

    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", a.toRoman(1));
    }

    @Test
    public void shouldConvert2ToII() {
        assertEquals("II", a.toRoman(2));
    }

    @Test
    public void shouldConvert3ToIII() {
        assertEquals("III", a.toRoman(3));
    }

    @Test
    public void shouldConvert4ToIV() {
        assertEquals("IV", a.toRoman(4));
    }

    @Test
    public void shouldConvert5ToV() {
        assertEquals("V", a.toRoman(5));
    }

    @Test
    public void shouldConvertBetweenFiveAndTen() {
        assertEquals("VII", a.toRoman(7));
    }

    @Test
    public void shouldConvert10toX() {
        assertEquals("X", a.toRoman(10));
    }

    @Test
    public void shouldConvert39toXXXIX() {
        assertEquals("XXXIX", a.toRoman(39));
    }
}
