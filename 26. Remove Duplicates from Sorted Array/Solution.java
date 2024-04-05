class Solution {
    public int removeDuplicates(int[] nums) {
        int turtle = 1;
        int hare = 1;
        
        while(hare != nums.length){
            if(nums[hare] != nums[hare-1]){
                nums[turtle] = nums[hare];
                turtle++;
            }  
            hare++;
        }
        return turtle; 
    }
}
