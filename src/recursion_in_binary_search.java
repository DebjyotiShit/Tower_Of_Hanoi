// Use recursion in binary search
public class recursion_in_binary_search {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,7,9};
        int target=90876;
        System.out.println(binary(arr,target,0,arr.length-1));
    }
    public static boolean binary(int[]arr,int target,int start,int end){
        if(start>end){
            return false;
        }
        else{
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            } else if (arr[mid]>target) {
                return binary(arr,target,start,mid-1);  // this is my first recursive call
            }
            else {
                return binary(arr,target,mid+1,end);  // this is my second recursive call
            }
        }
    }

}
