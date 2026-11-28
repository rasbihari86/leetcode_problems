class Solution {
    public int addDigits(int num) {

        while(num>9){
            int sum = 0;
            int n = num;
            while(n>0){
                int lastdigit = n%10;
                sum = sum + lastdigit;
                n=n/10;
            }
             num = sum ;
        }

        return num;
        
    }
}