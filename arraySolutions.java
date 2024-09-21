import java.util.*;

public class arraySolutions {
    public static void main(String args[]) {

// Question1 Take an array as input from the user. Search for a given number x and print the index at which it occurs  ?      
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Size of array : ");

        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // //input 
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // int x = sc.nextInt();

        // //output
        // for(int i=0; i<numbers.length; i++) {
        //     if(numbers[i] == x){
        //         System.out.println("x found at index : " + i);
        //     }else{
        //         System.out.println("Invalid number please try again!!");
        //     }
        // }

//Question2 Take an array of names as input from the user and print them on the screen ?
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Size of array : ");
        // int size = sc.nextInt();
        // String names[] = new String[size];

        // //input 

        // for(int i=0; i<size; i++){
        //     names[i] = sc.next();
        // }
        // //output
        // for(int i=0; i<names.length; i++){
        //     System.out.println("name " + (i+1) + " is : " + names[i]);
        // }

// Question3 Find the maximum & minimum number in an array of integers.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Size of array : ");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // //input
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;

        // for(int i=0; i<numbers.length; i++){
        //     i/f(numbers[i] < min){
        //         min = numbers[i];
        //     }

        //     if(numbers[i] > max){
        //         max = numbers[i];
        //     }
        // }

        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);
        
//Question4 Take an array of numbers as input and check if it is an array sorted in ascending order.       

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]) {

                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }
    }

}
