class Solution {
    public int maximumValue(String[] strs) {
  int max= 0;

  for(int i = 0; i<strs.length ; i++){
    int left = 0;
    boolean isletter = false;
    while(left < strs[i].length()){
        char c = strs[i].charAt(left);
        if(Character.isLetter(c)){
           isletter = true ;
           break;
        }
        left++;
    }
    if(isletter){
        max = Math.max(max , strs[i].length());
    }else{
        int n = Integer.parseInt(strs[i]);
        max = Math.max(max , n);
    }
  }

  return max;
        
    }
}