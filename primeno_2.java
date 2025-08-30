public class primeno_2 {
    public static void main(String[] args){
        int n = 40;
        boolean[] primes = new boolean[n+1];
        System.out.println("The Prime numbers are:");
        repPrime(n, primes);
        System.out.println("Between the number :"+n);
        
    }
    public static void repPrime(int n , boolean[] primes) {
        for(int i = 2 ; i*i<=n ; i++){
            if(!primes[i]){
                for(int j= i*2 ; j<= n ;j+=i){
                    primes[j] = true;
                }
            }
        }
        
        for(int i=0 ; i<= n ;i++){
            if(primes[i] == false){
                
                System.out.print(i+",");
                
            }
            }
        }
        
    }

