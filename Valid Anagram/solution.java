class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_Array = s.toCharArray();
        char[] t_Array = t.toCharArray();

        Arrays.sort(s_Array);
        Arrays.sort(t_Array);

        if (Arrays.equals(t_Array, s_Array)) {
            return true;
        } else {
            return false;
        }
    }
}