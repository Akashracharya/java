import java.util.*; 
public class primeno {
    public static void main(String[] args){
    boolean res = isPrime(4);
    if(res == true){
        System.out.println("Its Prime no");

    }else{
        System.out.println("Its Composite no");
    }
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int a = 2;
        while(a * a <= n){
            if(n % a == 0){
                return false;
            }
            a++;
        }
        return true;
    }
}
