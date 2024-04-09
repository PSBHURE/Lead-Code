class Solution {
    public boolean checkZeroOnes(String s) {
        char[] arr=s.toCharArray();
        int zero=1,mzero=0,one=1,mone=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                if(i<arr.length-1 && arr[i]=='1' && arr[i+1]=='1')
                    one++;
                else
                {
                    if(one>mone)
                        mone=one;
                    one=1;
                }
            }
            else
            {
                if(i<arr.length-1 && arr[i]=='0' && arr[i+1]=='0')
                    zero++;
                else
                {
                    if(zero>mzero)
                        mzero=zero;
                    zero=1;
                } 
            }
        }
        if(mone>mzero)
            return true;
        else
            return false;
    }
}