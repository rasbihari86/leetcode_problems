class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int [] temp = new int[heights.length];
        String [] result = new String[names.length];
        for(int i = 0 ; i<temp.length ; i++){
            temp[i]=heights[i];

        }
        int idx = 0;
        Arrays.sort(temp);
        for(int i = 0 ; i<names.length/2 ; i++){
            int tem = temp[i];
            temp[i] = temp[names.length -1 -i];
            temp[names.length -1 -i] = tem;
        }
        for(int i =0 ; i< temp.length ; i++){
            int p = 0;
            while(temp[i]!=heights[p]){
                p++;

            }
            if(temp[i]==heights[p]){
              result[idx] = names[p];
              idx++;

            }
        }
        return result ;

        
    }
}