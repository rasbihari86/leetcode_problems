class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

    List<Integer> list = new ArrayList<>();
       int p = num.length - 1;
       int carry = 0 ;

    while( p>=0|| k>0){
        int numval =  0 ;

     if(p>=0){
        numval = num[p];
    
     }

     int lastdigit = k % 10 ;
     int sum = numval + lastdigit + carry ;
     list.add(sum%10);
     carry = sum/10;

     p--;
     k = k/10;
    }
  if( carry>0){
        list.add(carry);
    }
    Collections.reverse(list);
    return list;

        
    }
  

}
