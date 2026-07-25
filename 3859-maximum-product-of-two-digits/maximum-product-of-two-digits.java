class Solution {
    public int maxProduct(int n) {
        int x=0;
        int y=0;
        while(n>0){
            int d=n%10;
            n/=10;
            if(d>x){
                y=x;
                x=d;
            }else if(d>y){
                y=d;
            }
        }
        return x*y;
        
    }
}