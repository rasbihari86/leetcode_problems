class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length%2!=0)return -1;
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length-1;
        int sum = skill[left]+skill[right];
        long result = 0;
        while(left<right){
            if(sum!=(skill[left]+skill[right])){
                return -1 ;

            }

            result = result + (skill[left]*skill[right]);
            left++;
            right--;


        }

        return result ;
        
    }
}