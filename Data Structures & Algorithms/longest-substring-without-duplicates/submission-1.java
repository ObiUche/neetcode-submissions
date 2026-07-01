class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , max = 0;

        Set<Character> window = new HashSet<>();

        for(int right = 0; right < s.length(); right++){
            // check the current char for comparison
            char current = s.charAt(right);

            while(window.contains(current)){
                window.remove(s.charAt(left));
                left++;
            }

            window.add(s.charAt(right));

            int currentLength = right - left + 1;
            max = Math.max(currentLength, max);
        }

        return max;

    }
}
