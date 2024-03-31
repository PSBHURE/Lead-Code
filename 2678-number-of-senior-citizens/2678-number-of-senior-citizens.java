class Solution {
    public int countSeniors(String[] details) {
      int[] arr=new int[details.length];
        int count=0;
          for(int i=0;i<arr.length;i++)
          {
              String temp=details[i];
              String a=String.valueOf(temp.charAt(11));
              String b=String.valueOf(temp.charAt(12));
              arr[i]=Integer.parseInt(a)*10+Integer.parseInt(b);
          }
        for(int x:arr)
        {
            if(x>60)
            count++;
        }
        return count;
    }
}