class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
  if(arr.length==0 && arr.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        
        for(int i = 0 ; i< arr.length-2 ;i++){
            
            int left = i+1;
            int right = arr.length-1 ;
            while(left<right){
                ArrayList<Integer>list = new ArrayList<>();
                int sum = arr[i] + arr[left] + arr[right];
                
                if(sum==0){
                    list.add(arr[i]);
                      list.add(arr[left]);
                        list.add(arr[right]);
                       set.add(list);
                    left++;
                    right--;
                }else if(sum<0){
                  left++;  
                }else{
                    right--;
                }
            }
            
        }
        return new ArrayList<>(set);
        
    }
}