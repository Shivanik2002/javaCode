import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for(int counter = 0; counter < 100; counter = counter + 1) {
        //     System.out.println("Hello World");
        // }

        // for(int i = 0; i < 11; i++) {
        //     System.out.print(i);
        // }

        // int i = 0;
        // while(i < 11) {
        //     System.out.println(i);
        //     i = i + 1;   // i++
        // }
        
        // int i = 0;
        // do { 
        //     System.out.println(i);
        //     i = i + 1;
        // } while(i < 11);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to print its multiplication table: ");
        // int number = sc.nextInt();
        // int i = 1;
        // do { 
        //     System.out.println(number + "*" + i + "=" + (number*i));
        //     i++;
        // } while (i <= 10);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to print its sum: ");
        // int num = sc.nextInt();
        // int sum = 0;
        // for(int i = 0; i <= num; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to print its multiplication table: ");
        // int n = sc.nextInt();

        // for(int i=1; i<11; i++){
        //     System.out.println(n*i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Even numbers up to " + n + "are:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        
    }
}
