public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int digit1 = number / 100;
        int digit2 = number / 10 % 10;
        int digit3 = number % 10;
        
        return digit1 + digit2 * 10 + digit3 * 100;
    }
}
