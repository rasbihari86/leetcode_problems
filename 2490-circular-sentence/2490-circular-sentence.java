class Solution {
    public boolean isCircularSentence(String sentence) {

    String[] arr = sentence.split(" ");

    char first = arr[0].charAt(0);
    char firstLast = arr[0].charAt(arr[0].length()-1);
    if(arr.length==1){
        return first==firstLast ;
    }

    for(int i = 1 ; i< arr.length ; i++){
        if(firstLast == arr[i].charAt(0)){
            firstLast= arr[i].charAt(arr[i].length()-1);
        }else{
            return false ;
        }
        
        if(i==arr.length-1 && firstLast != first){
            return false ;
        
        }

    }

    return true ;
        
    }
}