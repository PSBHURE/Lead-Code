class Solution {
    public boolean isPalindrome(int x) {
        int r=0,temp=x,sum=0;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            sum=sum*10+r;
        }
        if(sum==temp)
            return true;
        return false;
    }
}