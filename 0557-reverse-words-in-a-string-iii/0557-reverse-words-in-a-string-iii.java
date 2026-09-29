class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] arr =  s.split(" ");
        for(String word : arr){
            int len = word.length()-1;
            while(len>=0){
             sb.append(word.charAt(len));
             len--;
            }
            sb.append(" ");
        }

        return sb.toString().trim();

        
    }
}