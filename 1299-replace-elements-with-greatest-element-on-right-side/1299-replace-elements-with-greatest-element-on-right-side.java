class Solution {
    public int[] replaceElements(int[] arr) {
        for(int left = 0 ; left<arr.length-1 ; left++){
            int right= left+1;
            int max = Integer.MIN_VALUE;

            while( right<arr.length){
                max = Math.max(arr[right], max);
                right++;

            }
            arr[left]=max;

        }

        arr[arr.length-1] = -1;
        return arr ;
    
    }
}