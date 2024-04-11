class Solution {
    public int convertTime(String current, String correct) {
        if(current.equals(correct))
            return 0;
        String[] arr1=current.split(":");
        String[] arr2=correct.split(":");
        int count=0;
        int cur=Integer.parseInt(arr1[0])*60+Integer.parseInt(arr1[1]);
        int cor=Integer.parseInt(arr2[0])*60+Integer.parseInt(arr2[1]);
        while(cor-cur>=60)
        {
            count++;
            cur+=60;
        }
        while(cor-cur>=15)
        {
            count++;
            cur+=15;
        }
         while(cor-cur>=5)
        {
            count++;
            cur+=5;
        }
         while(cor-cur>=1)
        {
            count++;
            cur+=1;
        }
        return count;
    }
}

