// Last updated: 09/02/2026, 13:57:27
class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[ind++]=nums[i];
            }
        }
    return ind;
    }
}