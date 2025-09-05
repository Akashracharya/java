public class sumofdig {
    public static void main(String[] args) {
        int num = 1389854534;
        int res = sum(num);
        System.out.println("The res is "+ res);

    }
    static int sum(int num){
        if( num == 0){
            return 0;
        }
        return (num%10) + sum(num/10);
    }
}
