class Solution {
    public int findDuplicate(int[] nums) {
        int a=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                a=nums[i];
                break;
            }
        }

        return a;
    }
}