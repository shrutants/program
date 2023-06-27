class Solution {
    public void moveZeroes(int[] nums) {
        int dst = -1;
        while (++dst < nums.length && nums[dst] != 0); // Find first zero
        int src = dst;
        while (++src < nums.length)
            if (nums[src] != 0)           
                nums[dst++] = nums[src];  
        while (dst < nums.length)
            nums[dst++] = 0;              
    }
}