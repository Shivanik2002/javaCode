public class Recursion1 {

    //1. Print numbers from 5 to 1

    // public static void printNum(int n) {
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n-1);   
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     printNum(n);   // n =  5
    // }

    //2 Print numbers from 1 to 5

    // public static void printNum(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n+1);
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     printNum(n);
    // }

    //3 Print sum of first n natural numbers ?

    // public static void printSum(int i , int n, int sum){
    //     if(i == n){
    //         sum += i;
    //         System.out.println(sum);
    //         return; //?
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    //     System.out.println(i);
    // }
    // public static void main(String[] args) {
    //     printSum(1, 5, 0);
    // }

    //4 Print Factorial of a number n

    // public static int calcFactorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     int fact_nm1 = calcFactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = calcFactorial(n);
    //     System.out.println("Factorial of " + n + " numbers is : "  + ans);
    // }

    //5 Print the fibonacci sequence till nth term ?

    // public static void printFibo(int a, int b, int n){
    //     if(n == 0) {
    //         return;
    //     }
    //     int c = a+b;
    //     System.out.println(c);
    //     printFibo(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFibo(a, b, n-2);
    // }

    //6 Print x^n(stack height = n) 

    // public static int calcPower(int x, int n){
    //     if(n == 0) {
    //         return 1;
    //     }                  // Base cases
    //     if(x == 0) {
    //         return 0;
    //     }

    //     int xPower1 = calcPower(x, n-1);     // kaam
    //     int xPown = x * xPower1;
    //     return xPown; 
    // }
    // public static void main(String[] args) {
    //     int x = 2, n = 5;
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
    // }

    //7 Print x^n (stack height = logn)

    public static int calPower(int x, int n){
        if(n == 0) {
            return 1;
        }                  // Base cases
        if(x == 0) {
            return 0;
        }

        //if n is even 
        if(n % 2 == 0) {
            return calPower(x, n/2) * calPower(x, n/2);
        }else{
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }    
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }    
}
