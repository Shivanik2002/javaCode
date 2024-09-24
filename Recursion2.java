
public class Recursion2 {

//1 Tower of Hanoi 

    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if(n == 1){
    //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n = 3;
    //     towerOfHanoi(n, "S", "H", "D");

    // }

//2  Print a string in reverse "abcd" -> "dcba"

        // public static void printReverse(String str, int idx) {
        //     if(idx == 0){
        //         System.out.println(str.charAt(idx));
        //         return;
        //     }
        //     System.out.print(str.charAt(idx));
        //     printReverse(str, idx-1);
        // }
        // public static void main(String[] args) {
        //     String str = "abcd";
        //     printReverse(str, str.length()-1);
        // }

//3 Find the 1st & last occurance of an element in string -->>>>>>>>> "abaacdaefaah"


    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int idx, char element) {
    //     if(idx == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == element) {
    //         if(first == -1) {
    //             first = idx;
    //         } else {
    //             last = idx;
    //         }
    //     }
    //     findOccurance(str, idx+1, element);
    // }
    // public static void main(String[] args) {
    //     String str = "abaacdaefaah";
    //     findOccurance(str, 0, 'a');
    // }

//4 check if an array is sorted (strictly increase) ?

    // public static boolean isSorted(int arr[] , int idx) {
    //     if(idx == arr.length-1) {
    //         return true;
    //     }

    //     if(arr[idx] < arr[idx+1]) {
    //         // array is sorted till now
    //         return isSorted(arr, idx+1);
    //     } else {
    //         return false;
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1,7,5};
    //     System.out.println(isSorted(arr, 0));
    // }

//5 Move all 'x' to the end of the string ------>>>>> "axbcxxd"   

    // public static void moveAllX(String str, int idx, int count, String newString) {
    //     if(idx == str.length()) {
    //         for(int i=0; i<count; i++) {
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == 'x') {
    //         count++;
    //         moveAllX(str, idx+1, count, newString);
    //     } else {
    //         newString += currChar;  //newString = newString + currChar
    //         moveAllX(str, idx+1, count, newString);
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "axbcxxd";
    //     moveAllX(str, 0, 0, "");
    // }

//6 Remove all the duplicates from the string ?

    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicate(String str, int idx, String newString) {
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a']) {
    //         removeDuplicate(str, idx+1, newString);
    //     } else {
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDuplicate(str, idx+1, newString);
    //     }
    // }
    //  public static void main(String[] args) {
    //     String str = "abbccda";
    //     removeDuplicate(str, 0, "");
    // }

//7 Print all the subsequences of a string ---->>> "abc" ??

    // public static void subsequences(String str, int idx, String newString) {
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     //to be
    //     subsequences(str, idx+1, newString+currChar);

    //     // or not to be
    //     subsequences(str, idx+1, newString);
    // }

    // public static void main(String[] args) {
    //     String str =  "abc";
    //     subsequences(str, 0, "");
    // }


//8 Print all the unique subsequences of a string ---->>>> "aaa" ?

    // public static void subsequences(String str, int idx, String newString, HashSet<String> allSubSeq) {
    //     if(idx == str.length()) {
    //         if(allSubSeq.contains(newString)) {
    //             return;
    //         } else {
    //             System.out.println(newString);
    //             allSubSeq.add(newString);
    //             return;
    //         }
    //     }
    //     char currChar = str.charAt(idx);
    //     //to be
    //     subsequences(str, idx+1, newString+currChar, allSubSeq);

    //     // or not to be
    //     subsequences(str, idx+1, newString, allSubSeq);
    // }

    // public static void main(String[] args) {
    //     String str =  "aaa";
    //     HashSet<String> set = new HashSet<>();
    //     subsequences(str, 0, "",set);
    // }

//9 Print keypad combination ??

        public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu","vwx", "yz"};

        public static void printCombination(String str, int idx, String combination) {
            if(idx == str.length()) {
                System.out.println(combination);
                return;
            }
            char currChar = str.charAt(idx);
            String mapping = keypad[currChar - '0'];

            for(int i=0; i<mapping.length(); i++) {
                printCombination(str, idx+1, combination+mapping.charAt(i));
            }
        }
    public static void main(String[] args) {
        String str = "4";
        printCombination(str, 0, "");
    }
}
