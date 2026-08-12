class Solution {
    public static boolean isPalindrome(String s) {
        
        String m=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev=new StringBuilder(m).reverse().toString();
        return rev.equals(m);
    }
}