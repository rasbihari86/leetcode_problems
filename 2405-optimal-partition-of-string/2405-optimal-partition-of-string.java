class Solution {
    public int partitionString(String s) {
        int count = 0;
        
        int right = 0;
        while(right<s.length()){
            count++;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length() && !set.contains(s.charAt(right))){
            set.add(s.charAt(right));
            right++;
        }
        

        }

        return count ;
        
        
    }
}