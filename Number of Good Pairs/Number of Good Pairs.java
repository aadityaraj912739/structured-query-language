class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        int count = 0;
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                count++;
            }
            i++;
        }
        return count;
    }
}