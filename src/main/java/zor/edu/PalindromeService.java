/**
 * @author Oleksandr Zorenko KNUTE
 * @version 09.08.2020
 *
 * Classname PalindromeService
 **/

package zor.edu;
import java.util.logging.Logger;

public class PalindromeService
{
    private String string;

    //Regular expression to remove all the symbols except alphabetic and cyrillic
    private static final String regex = "[^a-zA-Zа-яА-Я]";

    private static final Logger LOGGER =
            Logger.getLogger(PalindromeService.class.getName());

    public PalindromeService(String string)
    {
        this.string = string;
    }

    public PalindromeService()
    {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    //Method to convert string to lower case
    private void toLowerCase()
    {
        LOGGER.info("Started toLowerCase method");
        setString(this.string.toLowerCase());
    }

    //Method to clean string using regex
    private void getCleanedString()
    {
        LOGGER.info("Started getCleanedString method");
        setString(this.string.replaceAll(regex, ""));
    }

    /**
     * Method to get reversed string
     * @return reversed string
     */
    private String getReversed()
    {
        LOGGER.info("Started getReversed method");
        return new StringBuilder(string).reverse().toString();
    }


    /**
     * Static method to check whether string is palindrome or not
     * @param string to check
     * @return boolean true if string is palindrome false if not and
     * null if string is undefined
     */
    public static boolean isValid(String string)
    {
        LOGGER.info("Started isValid method");
        return new PalindromeService(string).isValid();
    }


    private boolean isValid()
    {
        toLowerCase();
        getCleanedString();
        return this.getString().equals(this.getReversed());
    }
}
