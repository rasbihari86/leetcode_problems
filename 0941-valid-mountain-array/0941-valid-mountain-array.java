class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <3 ) return false ;
        int left = 1 ;
         while(left<arr.length && arr[left-1]<arr[left]){
            left++;
         }
                 // Peak cannot be first or last
        if (left == 1 || left == arr.length) {
            return false;
        }


         while(left<arr.length && arr[left]<arr[left-1]){
            left++;
         }
          

        
        return (arr.length == left);

    }
}