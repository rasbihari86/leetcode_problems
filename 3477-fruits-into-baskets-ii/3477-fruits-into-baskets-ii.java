class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i<fruits.length ; i++){

            for(int j = 0 ; j<fruits.length ; j++){
                if(!set.contains(j)){
                    if(fruits[i]<=baskets[j]){
                        set.add(j);
                        break;
                    }
                }
            }

        }

        return baskets.length-set.size();

    }
}