class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tsum=0;
        int lsum=0;
        for(int num:nums){
            tsum+=num;
        }
        for(int i=0;i<n;i++){
            
            if(lsum==tsum-lsum-nums[i]){
                return i;
            }
            
            lsum=lsum+nums[i];
            
        }
        return -1;
    }
}