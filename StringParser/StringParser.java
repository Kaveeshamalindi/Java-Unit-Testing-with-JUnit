public class StringParser {

    public int getCharacterCount(String input) {
        if (input == null) {
            return 0;
        }
        return input.length();
    }

    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

}
