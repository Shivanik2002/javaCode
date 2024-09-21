// public class StringFunctionsExample {
//     public static void main(String[] args) {
//         String str = "Hello, World!";
        
//         // 1. length() - Returns the length of the string
//         System.out.println("Length: " + str.length());

//         // 2. charAt() - Returns the character at a specified index
//         System.out.println("Character at index 0: " + str.charAt(0));

//         // 3. substring() - Returns a substring from the string
//         System.out.println("Substring (0, 5): " + str.substring(0, 5));

//         // 4. contains() - Checks if the string contains a specified sequence
//         System.out.println("Contains 'World': " + str.contains("World"));

//         // 5. indexOf() - Returns the index of the first occurrence of a specified character or string
//         System.out.println("Index of 'o': " + str.indexOf('o'));

//         // 6. toLowerCase() - Converts all characters to lowercase
//         System.out.println("Lowercase: " + str.toLowerCase());

//         // 7. toUpperCase() - Converts all characters to uppercase
//         System.out.println("Uppercase: " + str.toUpperCase());

//         // 8. trim() - Removes leading and trailing spaces
//         String strWithSpaces = "   Hello, World!   ";
//         System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

//         // 9. replace() - Replaces occurrences of a specified character or substring with another character or substring
//         System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

//         // 10. equals() - Compares two strings for content equality
//         System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));

//         // 11. isEmpty() - Checks if the string is empty
//         System.out.println("Is empty: " + str.isEmpty());

//         // 12. split() - Splits the string based on a specified delimiter
//         String[] splitStr = str.split(",");
//         System.out.println("Split by ',': " + splitStr[0] + " and " + splitStr[1]);

//         // 13. startsWith() - Checks if the string starts with the specified prefix
//         System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

//         // 14. endsWith() - Checks if the string ends with the specified suffix
//         System.out.println("Ends with 'World!': " + str.endsWith("World!"));
//     }
// }


public class StringBuilderFunctionsExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - Appends a string to the existing StringBuilder
        sb.append(", World!");
        System.out.println("After append: " + sb);

        // 2. insert() - Inserts a string at the specified position
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        // 3. delete() - Deletes a substring from the StringBuilder
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        // 4. deleteCharAt() - Deletes the character at a specified index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 5. reverse() - Reverses the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. replace() - Replaces a substring with another string
        sb.reverse();  // Reverting back to original string
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 7. capacity() - Returns the current capacity of the StringBuilder
        System.out.println("Capacity: " + sb.capacity());

        // 8. ensureCapacity() - Ensures the minimum capacity of the StringBuilder
        sb.ensureCapacity(50);
        System.out.println("New Capacity: " + sb.capacity());

        // 9. setLength() - Sets the length of the string
        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        // 10. charAt() - Returns the character at a specified index
        System.out.println("Character at index 1: " + sb.charAt(1));

        // 11. substring() - Returns a substring from the StringBuilder
        System.out.println("Substring (0, 2): " + sb.substring(0, 2));

        // 12. toString() - Converts the StringBuilder to a string
        System.out.println("Final string: " + sb.toString());
    }
}
