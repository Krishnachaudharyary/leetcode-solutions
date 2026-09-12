class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int count0=0;
        int count1=0;
        int count2=0;
        for(int num:nums){
            if(num==0){
                count0++;
            }
            else if(num==1){
                count1++;

            }
            else{
                count2++;
            }
        }
        int k=0;
        while(count0>0){
            nums[k++]=0;
            count0--;
            
        }
        while(count1>0){
            nums[k++]=1;
            count1--;
        }
        while(count2>0){
            nums[k++]=2;
            count2--;
        }
    }
}