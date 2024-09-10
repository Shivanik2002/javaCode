public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

System.out.println("_________________________________(1st)___________________________________");
        // 1st question
        //  *****
        //  *****
        //  *****
        //  *****

        for(int i=1; i<=n; i++) {
            // inner loop
            for(int j=1; j<=m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

System.out.println("_________________________________(2nd)___________________________________");
        // 2 questions
        //  *****
        //  *   *
        //  *   *
        //  *****

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++){
                //cell -> (i , j)
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

System.out.println("_________________________________(3rd)___________________________________");
        // 3rd question
        // *
        // **
        // ***
        // ****

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
System.out.println("_________________________________(4th)___________________________________");
        // 4th question
        // ****
        // ***
        // **
        // *

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
System.out.println("_________________________________(5th)___________________________________");
        // 5th question
        //           *
        //         * *
        //       * * *
        //    *  * * * 

        // outerloop
         for(int i=1; i<=n; i++) {
            //innerloop -> space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //innerloop -> star print
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }

System.out.println("_________________________________(6th)___________________________________");
         // 6th question
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

System.out.println("_________________________________(7th)___________________________________");
        // 7th question
        
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3 
        // 1 2
        // 1

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

System.out.println("_________________________________(8th)___________________________________");
        //8th question 
        // 1
        // 2  3 
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15

        int number = 1;
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++; //number = number+1
            }
            System.out.println();
        }

System.out.println("_________________________________(9th)___________________________________");
        //9th question 
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

System.out.println("_________________________________(10th)___________________________________");
        //10th question 
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //spaces
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

System.out.println("_________________________________(11th)___________________________________");
        //11th question 
        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        for(int i=1; i<=m; i++){
            //spaces
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

System.out.println("_________________________________(12th)___________________________________");
        //12th question
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5

        for(int i=1; i<=m; i++){
            //spaces
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

System.out.println("_________________________________(13th)___________________________________");
        //13th question
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        for(int i=1; i<=m; i++){
            //spaces
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            } 
            // 1st half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

System.out.println("_________________________________(14th)___________________________________");
    //14th question   
    //     *
    //    ***
    //   *****
    //  *******
    //  *******
    //   *****
    //    ***
    //     *  
    // upper case
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    // lower case

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
