
//Sort array check
import java.util.Arrays;

public class Find_Array_is_sort {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 5, 6,7};
            int n = arr.length;

            System.out.println(isSorted(arr, n));
            System.out.println(is_sort(arr,0,n-1 ));
        }

        // First approach
        public static boolean isSorted(int[] arr, int n) {
            // base case
            if (n == 1 || n == 0) {
                return true;
            }

            // recursive case
            if (arr[0] < arr[1] && isSorted(Arrays.copyOfRange(arr,1,n), n - 1)) {
                return true;
            }

            return false;
        }

        // Second approach
    public static boolean is_sort(int []arr,int s,int n){
            if (s==n){
                return true;
            }
            if(arr[s]<arr[s+1]&&is_sort(arr,s+1,n)){
                return true;
            }
            return false;
    }



    }


