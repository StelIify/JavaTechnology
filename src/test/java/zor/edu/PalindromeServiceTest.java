/**
 * @author Oleksandr Zorenko KNUTE
 * @version 09.08.2020
 *
 * Classname PalindromeService
 **/

package zor.edu;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest
{
    @Test
    public void whenTextIsEnglishAlphabeticAndPalindrome()
    {
        assertEquals(true, PalindromeService.isValid("AbBa"));
    }

    @Test
    public void whenTextIsEnglishAlphabeticAndNotPalindrome()
    {
        assertEquals(false, PalindromeService.isValid("harry potter"));
    }

    @Test
    public void whenTextIsCyrillicAlphabetAndPalindrome()
    {
        assertEquals(true, PalindromeService.isValid("потоп"));
    }

    @Test
    public void whenTextIsCyrillicAlphabetAndNotPalindrome()
    {
        assertEquals(false, PalindromeService.isValid("кушать"));
    }

    @Test
    public void whenTextIsNull()
    {
        assertEquals(null, PalindromeService.isValid(null));
    }

    @Test
    public void whenTextIsNumber()
    {
        assertEquals(false, PalindromeService.isValid("1337"));
    }

    @Test
    public void whenTextIsSymbol()
    {
        assertEquals(false, PalindromeService.isValid("$$$"));
    }

}