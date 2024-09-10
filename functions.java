
import java.util.Scanner;

//         Scanner sc = new Scanner(System.in);
//         String name = sc.next(); 

//         printMyName(name); //call the function
//     }
    
// }

// question 1  make a function to add 2 numbers and return the sum

// public class functions {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the Second number : ");
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b);
//         System.out.println("Sum of two numbers is : " + sum);
//     }
// }

// question 2  make a function to multiply 2 numbers and return the product.

// public class functions {
//     public static int multiply(int a, int b) {
//         return a * b;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the Second number : ");
//         int b = sc.nextInt();

//         System.out.println("Multiply of two numbers is : " + multiply(a, b));
//     }

// }


//question 3 find the factorial of a number.

// public class functions {
//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.println("Invalid number !!");
//             return;
//         }
//         int factorial = 1;
//         for(int i=n; i>=1; i--) {
//             factorial=factorial*i;
//         }
//         System.out.println(factorial);    
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         printFactorial(n);
//     }

// }

// practice question set 1
//1 Enter 3 numbers from the user & make a function to print their average.

// class Functions {
//     public static double average(double a, double b, double c) {
//         double average = (a + b + c) / 3;
//         return average;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         double a = sc.nextDouble();
//         System.out.print("Enter the second number: ");
//         double b = sc.nextDouble();
//         System.out.print("Enter the third number: ");
//         double c = sc.nextDouble();

//         // Call the average method and print the result
//         double average = average(a, b, c);
//         System.out.println("The average is: " + average);
//     }
// }

//2 Write a function to print the sum of all odd numbers from 1 to n.

// public class functions {
//     public static void printSumOfOddNumbers(int num) {
//         int sum = 0;
//         for(int i=1; i<=num; i++){
//             if(i % 2 != 0){
//                 sum += i;
//             }
//         }
//         System.out.println("The sum of all odd numbers from 1 to " + num + " is : " + sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();
//         printSumOfOddNumbers(num);
//     }
// }

//3 Write a function which takes in 2 numbers and returns the greater of those two.

// public class functions{
//     public static int greaterOfTwoNumbers(int m,int n){
//         if(m>n){
//             return m;
//         }else{
//             return n;
//         }
//     }
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number : "); 
//         int m = sc.nextInt();
//         System.out.print("Enter the second number : ");
//         int n = sc.nextInt();

//         int greater = greaterOfTwoNumbers(m, n);
//         System.out.println("The greater number between " + m + " and " + n + " is: " + greater);
// }

// }

//4 Wrie a function that takes in the radius as input and returns the circumference of a circle. 

// public class functions{
//     public static double getCircumference(double radius){
//         double Circumference = 2 * Math.PI * radius;
//         return Circumference;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of the circle: ");
//         double r = sc.nextDouble();
//         double radius = getCircumference(r);
//         System.out.println("circumference of a circle is : " + radius);

//     }
// }

//5 write a function that takes in age as input and returns if that person is eligible to vote or not . A person of age > 18 is eligible to vote.

// public class functions {
//     public static boolean isEligibleForVote(int age) {
//         return age >= 18;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();
//         boolean eligibility = isEligibleForVote(age);

//         if (eligibility) {
//             System.out.println("You are eligible to vote.");
//         } else {
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }

//6 write an infinite loop using do whie condition.

// public class functions {
//     public static void main(String[] args) {
//         int i = 0;
//         do{
//             System.out.println(i);
//             i = i+1;
//         } while(true);  // infinite loop condition
//     }
// }

//7  Write a program to enter the numbers till the user wants and at the end it should display the count of positive,negative nad zeros entered.

// public class functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         String userInput = "";

//         while (true) { 
//             System.out.print("Enter a number : ");
//             int number = sc.nextInt();

//             if(number > 0) {
//                 positiveCount++;
//             }else if(number < 0){
//                 negativeCount++;
//             }else{
//                 zeroCount++;
//             }

//             System.out.print("Do you want to enter another number? (type 'no' or 'stop' to end): ");
//             userInput = sc.next();

//             if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("stop")) {
//                 break;
//             }
//         }
//         System.out.println("Count of positive numbers : " + positiveCount);
//         System.out.println("Count of negative numbers: " + negativeCount);
//         System.out.println("Count of zeros: " + zeroCount);
//         sc.close();
//     }
// }

//8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e.x^n.

// public class functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the base number (x) : ");
//         double x = sc.nextDouble();

//         System.out.print("Enter the exponent (n) : ");
//         double n = sc.nextDouble();

//         double result = Math.pow(x,n);
//         System.out.println(x + " raised to the power of " + n + " is : " + result);
//     }
// }

// 9 Write a function that calculates the greatest Common Divisor of 2 numbers

public class functions {
    public static int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

//10 Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24.....
//in the Fibonacci series a number is the sum of the previous 2 numbers that came before it 

// public class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of terms in the Fibonacci series: ");
//         int n = sc.nextInt();
//         int firstTerm = 0, secondTerm = 1;

//         System.out.print("Fibonacci Series: " + firstTerm + " " + secondTerm);

//         for (int i = 2; i < n; i++) { 
//             int nextTerm = firstTerm + secondTerm;  
//             System.out.print(" " + nextTerm);  
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;
//         }

//     }
// }
