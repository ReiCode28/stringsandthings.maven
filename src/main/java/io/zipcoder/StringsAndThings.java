package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */

    public static int  countYZ(String str) {

        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
        if (str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'y') {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));

    }


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {


        return base.replace(remove, "");

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        String strNot = input.replaceAll("not", "");
        String strIs = input.replaceAll("is", "");

        int notCount = (input.length() - strNot.length()) / 3;
        int isCount = (input.length() - strIs.length()) / 2;

        System.out.println(" \"not\" occurs " + notCount + " times."); //"not" occurs x times.
        System.out.println(" \"is\" occurs " + isCount + " times."); //"is" occurs x times.

        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

        boolean result = false;


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
                result = true;

            } else if (input.charAt(i) == 'g' && input.charAt(i - 1) == 'g') {
                result = true;
            } else if (input.charAt(i) == 'g' && input.charAt(i + 1) != 'g') {
                result = false; 
            }
        }
        System.out.println(result);
        return result;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
