class Solution {
    public int lengthOfLongestSubstring(String str) {
       int left = 0;
        int right = 0;
        int maxlen = 0;
        HashSet<Character>set = new HashSet<>();
        while (right<str.length()){
            char ch = str.charAt(right);
            if(set.contains(ch)){
                while (str.charAt(left)!=ch){
                    set.remove(str.charAt(left));
                    left++;
                }
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            right++;
            maxlen = Math.max(maxlen,right-left);
            }
        return maxlen;

}
}