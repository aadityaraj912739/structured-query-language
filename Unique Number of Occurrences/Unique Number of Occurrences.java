class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int n = arr.length;
        while(i < n){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
                if(!set.contains(map.get(arr[i]))){
                    set.add(map.get(arr[i]));
                }else{
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}