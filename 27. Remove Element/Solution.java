class Solution {
    public int removeElement(int[] nums, int val) {
        int hare = 0;
        int turtle = 0;
        while(hare != nums.length){
            if(nums[hare] != val){
                nums[turtle] = nums[hare];
                turtle++; 
            }
            hare++;
        }
        return turtle; 
    }
}
