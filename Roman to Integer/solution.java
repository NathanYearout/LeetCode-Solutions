class Solution {
   public int romanToInt(String s) {
       final char roman_I = 'I';
       final char roman_V = 'V';
       final char roman_X = 'X';
       final char roman_L = 'L';
       final char roman_C = 'C';
       final char roman_D = 'D';
       final char roman_M = 'M';
       
       // Create a HashMap object called romans
       HashMap<Character, Integer> romans = new HashMap<Character, Integer>();
       // Map the numerals to ints
       int sum = 0;
       romans.put('I',1);
       romans.put('V',5);
       romans.put('X',10);
       romans.put('L',50);
       romans.put('C',100);
       romans.put('D',500);
       romans.put('M',1000);
       // Exceptions
       s=s.replace("IV","IIII");
       s=s.replace("IX","VIIII");
       s=s.replace("XL","XXXX");
       s=s.replace("XC","LXXXX");
       s=s.replace("CD","CCCC");
       s=s.replace("CM","DCCCC");

       for(int i=0;i<s.length();i++){
           sum = sum + (romans.get(s.charAt(i)));
       }

       return sum;
   }
}