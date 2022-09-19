package linear_search;

public class maxValueIn2D {
    public static void main (String[] args){
        int[][] arr = {
            {23,43,54,76},
            {12,32,4,55,76},
            {54,66,89,45,87}
        };
       
        System.out.println(search(arr));
    }
    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;
         for (int i = 0 ;i<arr.length;i++){
            for(int j =0 ; j<arr[i].length ; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
         }
         return max;
    }
    
}
