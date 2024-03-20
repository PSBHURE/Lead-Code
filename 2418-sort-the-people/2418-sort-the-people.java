class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String>map=new TreeMap<>();
        for(int i=0; i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        String[] arr=new String[names.length];
        List<String>list=new ArrayList<>();
        for(Map.Entry<Integer,String>entry:map.entrySet())
        {
            list.add(entry.getValue());
        }
        //for(int j=list.size()-1;j>=0;j--)
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=list.get(j);
        }
         //String[] arr1=new String[names.length];
        int start=0,end=arr.length-1;
        String temp="\0";
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}