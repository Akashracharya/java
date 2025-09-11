
import java.util.ArrayList;
public class find_arrayIndex_in_array {
    static ArrayList<Integer> findIdx(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findIdx(arr , target , index+1 , list);
        return list;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,5,6,6,5,7,6,64,3};
        int target= 5;
        ArrayList<Integer> ans = findIdx(arr , target , 0 , new ArrayList<>());
        System.out.println(ans);
    }
}
