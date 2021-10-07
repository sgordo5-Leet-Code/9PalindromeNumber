public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
        {
            return false;
        }

        String reversed = new StringBuilder().append(x).reverse().toString();
        return String.valueOf(x).equals(reversed);
    }
}
