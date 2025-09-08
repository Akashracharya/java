import static java.lang.Math.*;
public class palindrome {
    
    static int rev(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num , digits);
    }
    public static int helper(int num , int digits){
        if(num%10 == num){
            return num;
        }
        int rem = num%10;
        return rem * (int)(Math.pow(10 , digits-1))+ helper(num/10, digits-1);
    }
    public static void main(String args[]){
        int num = 12625;
        System.out.println(rev(num));
    }
}
