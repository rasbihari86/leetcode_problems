class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] ans = new int[2];
        int maxcount = 0;
       

        for(int i = 0 ; i< mat.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j<mat[0].length ; j++){
                if(mat[i][j]==1){
                    count++ ;
                }

            }

            if(count >maxcount ){
                ans[0] = i;
                ans[1] = count ;
                maxcount = count;
            }
        }

        return ans;
        
    }
}