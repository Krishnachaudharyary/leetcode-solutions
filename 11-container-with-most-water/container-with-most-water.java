class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxwater=0;
        while(left<right){
            int width=right-left;
            int max=Math.min(height[left],height[right]);
            int Area=max*width;
            maxwater=Math.max(Area,maxwater);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
    }
}