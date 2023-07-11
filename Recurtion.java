// import java.util.*;

public class Recurtion{
    
    // public static int clacfac(int n) {

    //     if(n==0 || n==1){
    //         return 1;
    //     }

    //     int factorial_nmone = clacfac(n-1);
    //     int fact_n = n*factorial_nmone;
    //     return fact_n;
        
    // }
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Now Write the Number");
    //     int n = sc.nextInt();
    //     int result = clacfac(n);
    //     sc.close();
    //     System.out.println("The Factorial of the number "+ n + " is "+result);

    // }


    public static int fibRecursion(int count) {
        if (count == 0) {
          return 0;
        } 
    
        if (count == 1 || count == 2) {
          return 1;
        } 
        return fibRecursion(count - 1) + fibRecursion(count - 2);
      }
    
      public static void main(String args[]) {
        int fib_len = 9;
    
        System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
    
        for (int i = 0; i < fib_len; i++) {
          System.out.print(fibRecursion(i) + " ");
        }
      }
}