class Solution {
    public int minSteps(String s, String t) {
        int [] freq1 = new int[26];
        int count = 0 ;
        for(int i = 0 ; i<s.length(); i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int j = 0 ; j<t.length() ; j++){
            freq1[t.charAt(j)-'a']--;
        }

        for(int k = 0 ; k<freq1.length ; k++){
            if(freq1[k]>0){
                count = count + freq1[k];
            }
        }
        return count;
    
    }
}