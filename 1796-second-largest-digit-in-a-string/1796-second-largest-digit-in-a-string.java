class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                int num =s.charAt(i) - '0';
                if(!list.contains(num)){
                list.add(num);
                }
                
            }

        }
         Collections.sort(list);
            if(list.size()>1){
                return list.get(list.size()-2);
            }

            return -1 ;
        
    }
}