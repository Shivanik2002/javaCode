
import java.util.Scanner;






public class twoDArrays {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rows number : ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the cloumns number : ");
        // int cols = sc.nextInt();

        // int[][] numbers = new int[rows][cols];

        // //input 
        // //rows
        // for(int i=0; i<rows; i++){
        //     //coloumns
        //     for(int j=0; j<cols; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // //Output
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

// Take a matrix as input from the user. Search for a given number x and print the icdices at which it occurs ?

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rows number : ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the cloumns number : ");
        // int cols = sc.nextInt();
        
        // int[][] numbers = new int[rows][cols];

        // //input Rows
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.print("Enter your x value : ");
        // int x = sc.nextInt();

        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         //compare with x
        //         if(numbers[i][j] == x) {
        //             System.out.println("x found at locations  (" + i + " , " + j + ") ");
        //         }
        //     }
        // }

// Print the spiral order matrix as output for a given matrix of numbers. 
//  1 5  7  9  10 11
//  6 10 12 13 20 21       
//  9 25 29 30 32 41
// 15 55 59 63 68 70
// 40 70 79 81 95 105

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int matrix[][] = new int[m][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("The Spiral order Matrix is : ");
        // int rowStart = 0;
        // int rowEnd = n-1;
        // int colStart = 0; 
        // int colEnd = m-1;

        // while(rowStart <= rowEnd && colStart <= colEnd) {
        //     //1
        //     for(int col=colStart; col<= colEnd; col++){
        //         System.out.print(matrix[rowStart] [col] + " ");
        //     }
        //     rowStart++;

        //     //2
        //     for(int row=rowStart; row<=rowEnd; row++){
        //         System.out.print(matrix[row][colEnd] + " ");
        //     }
        //     colEnd--;

        //     //3
        //     for(int col=colEnd; col>=colStart; col--){
        //         System.out.print(matrix[rowEnd][col] + " ");
        //     }
        //     rowEnd--;

        //     //4
        //     for(int row=rowEnd; row>=rowStart; row--){
        //         System.out.print(matrix[row] [colStart] + " ");
        //     }
        //     colStart++;
        //     System.out.println();
            
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n numbers : ");
        int n = sc.nextInt();
        System.out.print("enter m numbers : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");
        // To print transpose
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
