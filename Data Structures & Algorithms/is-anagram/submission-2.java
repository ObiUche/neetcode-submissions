

class Solution {
    public boolean isAnagram(String s, String t) {

        String[] array1 = new String[s.length()];
        String[] array2 = new String[t.length()];

        array1 = s.split("");
        array2 = t.split("");

        List<String> s1 = Arrays.stream(array1).sorted().toList();
        List<String> s2 = Arrays.stream(array2).sorted().toList();

        return s1.equals(s2);
        
    }
}