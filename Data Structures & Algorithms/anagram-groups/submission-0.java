class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        Map<String, List<String>> groupedAnagram = new HashMap<>();
        
        for(String s: strs){
            
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            
            if(!groupedAnagram.containsKey(sortedString)){
                groupedAnagram.put(sortedString,new ArrayList<>());
            }
            groupedAnagram.get(sortedString).add(s);
            
        }
        return new ArrayList<>(groupedAnagram.values());
    }


    }
