class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int  i = 0;
        int j  = i+1;
        int k = j+1;
        for(i = 0 ; i<arr.length-2 ; i++){
            for(j=i+1 ; j<arr.length-1 ; j++){
                for( k= j+1 ;k<arr.length ;k++){
            int Idiff = Math.abs(arr[i]-arr[j]);
             int Jdiff = Math.abs(arr[j]-arr[k]);
              int Kdiff = Math.abs(arr[i]-arr[k]);
              if(Idiff<=a && Jdiff<=b && Kdiff<=c){
                count++;
              }
                }
            }
        }
        return count;
    }
}