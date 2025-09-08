import static java.lang.Math.*;
public class palindrome {
    
    public static int rev(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num , digits);
    }
    public static int helper(int num , int digits){
        if(num%10 == num){
            return num;
        }
        int rem = num%10;
        return rem * (int)(Math.pow(10 , digits-1)) + helper(num/10,digits-1);
        
    }
    public static void main(String args[]){
        int num = 1331;
        int revNum = rev(num);
        if(num == revNum){
            System.out.println("The number "+num+" is Palindrome");
        }else{
            System.out.println("The number is not palindrome "+num+" rev is "+revNum);
        }
    }
}
