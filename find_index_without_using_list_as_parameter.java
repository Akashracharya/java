import java.util.ArrayList;

public class find_index_without_using_list_as_parameter {
    static ArrayList<Integer> findIdx2(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> prevCalls = findIdx2(arr , target , index+1);
        list.addAll(prevCalls);
        return list;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,2,1,3};
        int target = 3;
        System.out.println(findIdx2(arr , target , 0));
    }
}
