class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer>divide=new ArrayList<>();
        List<Integer>notdivide=new ArrayList<>();
        int d=0,nd=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divide.add(i);
                d+=i;
            }
            else
            {
                notdivide.add(i);
                nd+=i;
            }
        }
        return nd-d;
    }
}