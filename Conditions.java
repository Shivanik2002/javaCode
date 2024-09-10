import java.util.*;
public class Conditions {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();

    //     if(age > 18){
    //         System.out.println("Adult");
    //     }else{
    //         System.out.println("Not Adult");
    //     }
    // }
        

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();

    //     if (number % 2 == 0){
    //         System.out.println("Even number");
    //     }else{
    //         System.out.println("odd number");
    //     }
    // }    

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     if (a == b){
    //         System.out.println("Equal");
    //     }
    //     else if (a > b){
    //         System.out.println("a is greater");
    //     }
    //     else{
    //         System.out.println("a is lesser");
    //     }

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int Button = sc.nextInt();

    //     switch(Button) {
    //         case 1 : System.out.println("hello !!");
    //         break;
    //         case 2 : System.out.println("Namste !!");
    //         break;
    //         case 3 : System.out.println("bonjour !!");
    //         break;
    //         default : System.out.println("invalid button !!");
    //     }

    // }    

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter the first number (x): ");
    //     int x = sc.nextInt();

    //     System.out.print("Enter the Second number (y): ");
    //     int y = sc.nextInt();

    //     System.out.print("Enter the operation (addition, subtraction, multiplication, division, modulo): ");
    //     String operation = sc.next().toLowerCase();

    //     int result = 0;
    //     switch (operation) {
    //         case "addition":
    //             result = x + y;
    //             break;

    //         case "subtraction":
    //             result = x - y;
    //             break;

    //         case "multiplication":
    //             result = x * y;
            
    //         case "division":
    //            if (y != 0) {
    //             result = x / y; 
    //            }  else {
    //             System.out.println("Division by zero is not allowed");
    //             return;

    //            }
    //            break;
    //         case "modulo":
    //            if (y != 0) {
    //             result = x % y;
    //             } else {
    //                 System.out.println("Modulo by zero is not allowed.");
    //                 return;
    //             }
    //             break;
    //         default:
    //             System.out.println("Invalid operation.");
    //             return;
               

    //     }

    //     System.out.println("Result:" + result);

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the month (1-12): ");
        int monthNumber = sc.nextInt();

        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "january";
                break;

            case 2:
                monthName = "February";
                break;
        
                case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;    

            default:
                monthName = "Invalid month number. Please enter a number between 1 and 12.";
                break;
        }

        System.out.println("Month is:" + monthName);

    }

}


