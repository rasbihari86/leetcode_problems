class Solution {
    public int maxPower(String s) {
        
        int count = 1 ;
        int maxcount = 1;
        for(int i =1 ; i< s.length() ; i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;

            }else{
                maxcount = Math.max(count , maxcount);
                count = 1;
            }

        }
        maxcount = Math.max(count , maxcount);
        return maxcount ;
    }
}