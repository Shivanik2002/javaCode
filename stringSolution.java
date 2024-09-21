import java.util.Scanner;

public class stringSolution {
    public static void main(String args[]) {

// 1Question Take an array of strings input from the user & find the cumulative (combined) length of all those strings.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your array size : ");
        // int size = sc.nextInt();
        // String array[] = new String[size];
        // int totLength = 0;      
        
        // for(int i=0; i<size; i++) {
        //     array[i] = sc.next();
        //     totLength += array[i].length();
        // }
        // System.out.println(totLength);

// 2Question Input a string from the user. Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.
        // Example original = "eabcdef" ; result = "iabcdif"  || Original = 'xyz' ; result = 'xyz'

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String str = sc.next();
        // String result = "";

        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == 'e') {
        //         result += 'i';
        //     } else {
        //         result += str.charAt(i);
        //     }
        // }

        // System.out.println("Modified string: " + result);

// input an email from the user . You have to create a username from the email by deleting the part thet comes after '@'. Display that username to the user.@interface
// Example email = "apnaCollegeJava@gmail.com";
//username = "apnaCollegeJava"      

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email = sc.next();
        String userName = "";

        for (int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@') {
                break;
            }else{
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
    
}
