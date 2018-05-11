public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        // write your code here
        while (b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1; // append 1 bit 0 after it
        }
        
        return a;
    }
}
