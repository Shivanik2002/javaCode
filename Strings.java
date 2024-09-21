import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // String Declaration and concatenation
        String firstName = "Shivani";
        String lastName = "Kushwah";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length of the string
        System.out.println("Length of Full Name: " + fullName.length());

        // charAt - Display each character of the fullName
        System.out.println("Characters in Full Name:");
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // Compare two strings
        String name1 = "Tony";
        String name2 = "Tony";

        // Compare strings using compareTo
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // SUbString(beg index, end index)
        String sentence = "My name is Shivani Singh";
        String Name = sentence.substring(11,sentence.length());
        System.out.println(Name);

        // Strings are immutable
        // parseInt
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //ToString
        int numbers = 123;
        String Str = Integer.toString(number);
        System.out.println(Str);
        System.out.println(Str.length());

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

    }
}
