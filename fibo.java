import java.util.*;
public class fibo{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int res = binaryrec(arr, 0, arr.length-1,target);
        System.out.println(res);
}
    public static int binaryrec(int[] arr , int s , int e, int target){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if( arr[mid] == target){
            return mid;
        }
        if( arr[mid] < target){
            return binaryrec(arr, mid+1 , e, target);
        }
        return binaryrec(arr, s, mid-1, target);
    }
}
