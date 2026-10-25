class Solution {
    public int characterReplacement(String str, int k) {
        
        int maxlen = 0 ;
        int left = 0 ;
        int maxfreq = 0;
        HashMap<Character , Integer> map = new HashMap<>();

        for(int right = 0 ; right<str.length() ; right++){

        map.put(str.charAt(right),map.getOrDefault(str.charAt(right),0)+1);

        maxfreq = Math.max(maxfreq , map.get(str.charAt(right)));

        while((right-left+1) - maxfreq > k){
            map.put(str.charAt(left),map.getOrDefault(str.charAt(left),0)-1);
            left++;
        }

        maxlen  = Math.max(maxlen , right-left+1);


        
        }

        return maxlen;

 
    }
}