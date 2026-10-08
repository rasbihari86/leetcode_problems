class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i< arr.length  ; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }
        ArrayList<Map.Entry<Integer,Integer>>list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> a.getValue()-b.getValue());
        int unique = list.size();
        for(int i = 0 ; i<list.size(); i++){
           int val = list.get(i).getValue();
           if(k>=val){
            k = k-val;
            unique--;
           }else{
            break;
           }
        }

       return unique;
        
    }
}