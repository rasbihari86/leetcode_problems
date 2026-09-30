class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0 ;
        int right = s.length() - 1;

        while(right>=0){
            
            while(s.charAt(right)=='*'){
                count++;
                right--;
            }
            if(count>0){
                count--;
                right--;
            }else{
            sb.append(s.charAt(right));
            right--;
            }
        }
        sb.reverse();

        return sb.toString();
    }
}