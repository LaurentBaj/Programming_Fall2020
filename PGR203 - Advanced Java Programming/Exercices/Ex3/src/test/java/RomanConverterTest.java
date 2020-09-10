import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {
    @Test
    void convert1toI(){
        RomanConverter a = new RomanConverter();
        assertEquals("I", a.convert(1));
    }

    @Test
    void convert2toII(){
        RomanConverter a = new RomanConverter();
        assertEquals("II", a.convert(2));
    }

    @Test
    void convert4toIV(){
        RomanConverter a = new RomanConverter();
        assertEquals("IV", a.convert(4));
    }

    @Test
    void convertEveryNum(){
        RomanConverter a = new RomanConverter();
        assertEquals("XLII", a.convert(42));
    }

    @Test
    void checkMaxNumber(){
        RomanConverter a = new RomanConverter();
        assertEquals("Error", a.convert(4000));
    }
}
