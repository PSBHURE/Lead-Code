class Solution {
    public String restoreString(String s, int[] indices) {
      char[] arr=s.toCharArray();
        List<Character>list=new ArrayList<>();
      Map<Integer,Character>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(indices[i],arr[i]);
        }
        for(Map.Entry<Integer,Character>entry:map.entrySet())
        {
            list.add(entry.getValue());
        }
        char[] arr1=new char[list.size()];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=list.get(i);
        }
        
        return String.valueOf(arr1);
    }
}