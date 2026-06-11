import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class StringParserTest {

    StringParser text=new StringParser();

    @Test 
    public void testgetCharacterCount_ValidString(){
        assertEquals(5, text.getCharacterCount("hello"));
        assertEquals(0, text.getCharacterCount(""));
    }

    @Test 
    public void testgetCharacterCount_NullInput(){
        assertEquals(0, text.getCharacterCount(null));
    }

    @Test 
    public void  testisPalindrome_validPalindrome(){
        assertTrue(text.isPalindrome("radar"));
    }

    @Test 
    public void  testisPalindrome_ComplexMultiWordPalindrome(){
        assertFalse(text.isPalindrome("'Go hang a salami I am a lasagna hog"));
    }

    @Test 
    public void  testisPalindrome_InvalidPalindrome(){
        assertFalse(text.isPalindrome("Software"));
    }

    @Test 
    public void  testisPalindrome_NullInput(){
        assertFalse(text.isPalindrome("Software"));
    }
}