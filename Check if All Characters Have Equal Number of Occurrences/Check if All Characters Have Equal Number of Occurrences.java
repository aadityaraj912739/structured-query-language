class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        while(i < n){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            i++;
        }

        int j = 0;
        int freqOfCharacter = map.get(s.charAt(j));
        while(j < n){
            
            if(freqOfCharacter != map.get(s.charAt(j))){
                return false;
            }
            j++;
        }
        return true;
    }
}