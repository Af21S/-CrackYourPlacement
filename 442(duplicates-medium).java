class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap();
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])){
                 map.put(nums[i],i);
            }
            else{
                list.add(nums[i]);
            }
           }
         
      
        return list;
    }
}