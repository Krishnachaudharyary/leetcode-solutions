class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=0;
        for(int i=0;i<=n;i++){        // 0 se leker end tak ka XOR
            a^=i;
        }
        for(int num:nums){          // 0 se leker jitne element h unka XOR
            b^=num;
        }
        return a^b;               // dono ka XOR
    }
}