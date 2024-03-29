class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int r=0,temp=i;
            boolean flag=true;
            while(temp>0)
            {
                r=temp%10;
                if(r==0)
                {
                    flag=false;
                    break;
                }
                { if(i%r!=0)
                {
                    flag=false;
                    break;
                }}
                temp=temp/10;
            }
            if(flag )
            list.add(i);
           
        }
        return list;
    }
}