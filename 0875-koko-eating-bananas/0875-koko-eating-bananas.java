class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
     for(int i = 0 ; i< piles.length ; i++){
       max = Math.max(max , piles[i]);


     }
     int low = 1;
     int high= max;

     while(low<high){
        int mid = (high+low)/2;
        int reqTime = req(piles,mid);

        if(reqTime<=h){
            high = mid ;
        }else{
            low = mid+1;
        }

     }
     return low;


    }

    public int req(int [] piles , int mid){
        int time = 0;
        for(int i =0 ; i<piles.length ; i++){
           time += (piles[i] + mid - 1) / mid;
        }

        return time;
    }
}