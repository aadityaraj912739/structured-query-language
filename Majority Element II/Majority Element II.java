class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int desResult = n/3;
        while(i < n){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            if(map.get(nums[i]) > desResult){
                list.add(nums[i]);
            }
            i++;
        }
        return list;
    }
}