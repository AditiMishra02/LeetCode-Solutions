
/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"  */
 

class Solution {
    public String reverseVowels(String s) {

        char[] charArray = s.toCharArray();
        int left = 0,right = charArray.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(charArray[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(charArray[right]) == -1) {
                right--;
            }

            // Swap vowels
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);

    }
}