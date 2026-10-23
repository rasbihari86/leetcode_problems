class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int left = 0 ; left<words.length-1 ; left++){
            HashSet<Character> set = new HashSet<>();
            
             for(int i = 0 ; i<words[left].length() ; i++){
                set.add(words[left].charAt(i));

            }
           for( int right = left + 1 ; right<words.length ; right++){
            HashSet<Character> set2 = new HashSet<>();
              for(int i = 0; i<words[right].length() ; i++){
                set2.add(words[right].charAt(i));

              }
              if(set.equals(set2)){
                count++;
              }
           }
        }

        return count;
        
    }
}