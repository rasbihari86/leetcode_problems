class Solution {
    public void duplicateZeros(int[] arr) {
        int left = 0 ;
        while(left< arr.length){
            if(arr[left]==0){
                func(arr,left);
                if(left<arr.length-1){
                arr[left+1]= 0;
                left++;
                }
            }
            left++;
        }

    }

    public void func(int [] arr,int left){
        int end = arr.length-1 ;

        while(left+1<end){
            arr[end] = arr[end - 1];
            end--;
        }

    }
}