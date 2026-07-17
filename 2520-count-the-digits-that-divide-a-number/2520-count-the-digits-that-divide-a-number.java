class Solution {
    public int countDigits(int num) {
        int count = 0 ;
        int n = num;
        while(n>0){
            int lastdigit = n%10 ;
            if(num%lastdigit==0)count++;
            n=n/10;
        }
        return count;
    }
}