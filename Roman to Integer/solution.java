class Solution {
    public boolean isPalindrome(int x) {
        long reversedNum = 0;
        long input_long = x;
        
        if (x >= 0) {
            while (input_long != 0) {
                reversedNum = reversedNum * 10 + input_long % 10;
                input_long = input_long / 10;
                }
        } else {return false;}
        
        return (reversedNum == x);
    }
}