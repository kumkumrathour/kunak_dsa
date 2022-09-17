package linear_search;

public class searchInRange {
    public static void main(String[] args){
    int[] arr ={32,-58,43,66,21,78,-45};
    int target = 43;
    System.out.print(linearSearch(arr,target,2,5));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length== 0){
            return -1;
        }
        for(int i =start; i<=end ;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
