class Solution {
    public boolean isPalindrome(String s) {
        String pureString = s.replaceAll("[^a-zA-Z0-9]", "");
        pureString = pureString.toLowerCase();
        String reverseString = new StringBuilder(pureString).reverse().toString();
        return(pureString.contentEquals(reverseString));
    }
}
