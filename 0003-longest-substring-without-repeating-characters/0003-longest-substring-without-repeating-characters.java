class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int right = 0;
        int longest = 0 ;

  HashMap<Character , Integer> map = new HashMap<>();
  while(left<s.length() && right<s.length()){
    map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
    while(map.get(s.charAt(right))>1 && left<s.length()){
        map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
        left++;
        


    }
    longest = Math.max(longest , right - left+ 1);
    right++;
  }

  return longest ;
   
}
}