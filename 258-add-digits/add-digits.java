class Solution {
    public int addDigits(int num) {
        
        while(num>=10){             //agar num 10 se bada hoga to loop mein jayega
            int sum=0;
            while(num>0){           //add digits til single comes
                int r=num%10;
                sum+=r;
                num/=10;
            }
            num=sum;                //num bana denge sum ko jab tak single digit na aa jaye
        }
        return num;
    }
}