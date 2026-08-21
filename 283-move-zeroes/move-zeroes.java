class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){         //non zeroes ko dalega starting se!
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }                      /* j update hoke 3 ho gaya pehle example mei
                                        while loop ke liye!  */
        while(j<n){             //fill kerdega zeroes ko jo bache h
            nums[j]=0;
            j++;
        }
    }
}