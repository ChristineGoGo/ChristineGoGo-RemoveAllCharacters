import java.util.*;
public class RemoveAllCharacter {
    /**
     * Return a String that has all the character of a String removed.
     * You could either use a for loop to build a new String that excludes a character, or you could cleverly use
     * the replaceAll method of String to replace a character with a blank space.
     *
     * Here are the docs for String: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param str A string.
     * @param ch A string containing a single character which should be removed from str.
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){
        // return null;
        String result = "";
        String CurrentCharacter = "";
        // int ToRemove = str.indexOf(ch);

        for (int i = 0; i < str.length(); i++) {
            CurrentCharacter += str.charAt(i);
            if (!(CurrentCharacter.compareTo(ch) == 0)) {
                char AddString = str.charAt(i);
                result += AddString;
            }
            CurrentCharacter = "";
         
        }
        return result;
    }
}