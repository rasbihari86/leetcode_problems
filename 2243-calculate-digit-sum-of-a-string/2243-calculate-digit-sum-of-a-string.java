class Solution {
    public String digitSum(String s, int k) {
        //String Builder 
        
        while(s.length()>k){
            StringBuilder sb = new StringBuilder();

             int cnt = 0;
             int sum= 0;
            for(int i = 0 ; i<s.length();i++){
                sum = sum + Character.getNumericValue(s.charAt(i));
                cnt++;
                if(cnt==k || i==s.length()-1){
                     sb.append(sum);
                    cnt=0;
                    sum=0;


                }

            }
            s=sb.toString();
        }

        return s ;
        
    }
}