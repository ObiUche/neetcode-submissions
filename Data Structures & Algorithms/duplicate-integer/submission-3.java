class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet set = new HashSet<Integer>();


        for(int item: nums){
            set.add(item);
        } 
        System.out.println(set);

        if (nums.length == set.size()){
            return false;
        } else{
            return true;
        }
        
    }
}