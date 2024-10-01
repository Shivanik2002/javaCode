
// public class backTrackingSolutions {
//     public static List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(result, new ArrayList<>(), nums);
//         return result;
//     }

//     private static void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums) {
//         if (current.size() == nums.length) {
//             result.add(new ArrayList<>(current));  // Add a copy of the current list to the result
//         } else {
//             for (int i = 0; i < nums.length; i++) {
//                 if (current.contains(nums[i])) continue;  // Skip if number is already in the current list
//                 current.add(nums[i]);
//                 backtrack(result, current, nums);  // Recur with the updated list
//                 current.remove(current.size() - 1);  // Backtrack by removing the last added number
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 3};
//         int[] nums2 = {0, 1};
//         int[] nums3 = {1};

//         System.out.println(permute(nums1));  // Output: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
//         System.out.println(permute(nums2));  // Output: [[0, 1], [1, 0]]
//         System.out.println(permute(nums3));  // Output: [[1]]
//     }
// }


//2 https://leetcode.com/problems/sudoku-solver/ 

public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;  // Place the digit
                            
                            if (solve(board)) {  // Recur to solve the rest
                                return true;
                            }
                            
                            board[row][col] = '.';  // Backtrack
                        }
                    }
                    return false;  // If no valid number can be placed, backtrack
                }
            }
        }
        return true;  // Puzzle solved
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Check if the number is in the current row, column, or 3x3 box
            if (board[row][i] == num || board[i][col] == num || 
                board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        // Print the solved Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
