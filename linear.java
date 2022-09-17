package linear_search;


public class linear {
    public static void main(String[] args){
    int[] num = {21,34,56,76,867,23,56,78,87};
    int target = 56;
    int ans = linearSearch(num,target);
   System.out.println(ans);
}
static int linearSearch(int[] arr , int target){
    if(arr.length == 0){
        return -1;
    }
    for(int i =0 ; i<arr.length ; i++){
        if(arr[i] == target){
            return target ;
        }
    }
    return -1;
}
}