class Solution {
    public int maxVowels(String s, int k) {
    HashSet<Character> set =   new HashSet<>();
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');
    int right = 0 ;
    int currcnt = 0;
    int maxcnt  = 0;
    for(right = 0 ; right<k ; right++){
        if(set.contains(s.charAt(right))){
            currcnt++;
        }

    }

    maxcnt = currcnt;
    int left = 0;
    while(right<s.length()){
        if(set.contains(s.charAt(left))){
            currcnt--;
            
        }
        if(set.contains(s.charAt(right))){
            currcnt++;
            

        }

        maxcnt = Math.max(currcnt , maxcnt);
        left++;
        right++;

    }

    return maxcnt;
    }
}