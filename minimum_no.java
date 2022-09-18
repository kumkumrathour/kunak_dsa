package linear_search;

public class minimum_no {
    public static void main(String[] args) {
        int[] arr = {32,43,-46,-54,54,48,2};
        System.out.println(minValue(arr));
    }
    static int minValue(int[] arr){
          int ans = arr[0];
          for(int i =1 ;i<arr.length; i++){
               if(arr[i]<ans){
                ans = arr[i];
               }
          }
           return ans;
    } 
}
