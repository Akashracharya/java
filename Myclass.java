import java.util.*;
public class Myclass{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int res = binary(arr, 0, arr.length-1,target);
        System.out.println(res);
}
    public static int binary(int[] arr , int s , int e, int target){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if( arr[mid] == target){
            return mid;
        }
        if( arr[mid] < target){
            return binary(arr, mid+1 , e, target);
        }
        return binary(arr, s, mid-1, target);
    }
}
