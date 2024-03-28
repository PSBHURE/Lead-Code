class Solution {
    public int countDigits(int num) {
       int count=0,temp=num,r=0;
        while(num>0)
        {
            r=num%10;
            if(temp%r==0)
                count++;
            num=num/10;
        }
        return count;
    }
}