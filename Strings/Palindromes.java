/*
 *  The following code fragment is a one-line
 *  implementation of a simple palindrome check.
 *  Use only if you just need to confirm that a
 *  given string is a palindrome (with no other
 *  conditions).
 *
 */
package Strings;
class Palindromes{
    public static void main(String[] args){
        String s = "RacecaracecaR";
        if(s.equals(new StringBuilder(s).reverse().toString())) {
            // do something
        }
    }

    /*
     *  The above implementation should only be applied
     *  in cases for which no other conditions are to be
     *  accounted. In all other cases, a more general-
     *  purpose approach may be better suited:
     */
    boolean isPalindrome(String s) {
        int n = s.length();
        // Since we are aiming to eventually meet in the middle,
        // only iterate through n/2
        for (int i = 0; i < (n/2); ++i) {
            // Note here s.charAt(n - i - 1).
            // This fetches the last character, subtracts 1
            // to account for the 0-count, and then uses i
            // as a makeshift decrement operator.
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true; // return true if it makes it through the whole thing
    }

}



