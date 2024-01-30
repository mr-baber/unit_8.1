/*
 * Represent collections of related primitive or object 
 * reference data using two-dimensional (2D) array objects.
 */

 class Main {
    public static void main(String[] args) {
      /*
       * 2D arrays are stored as arrays of arrays.
       * Therefore, the way 2D arrays are created and
       * indexed is similar to 1D array objects.
       */
      String[][] squares = new String[3][3];
      System.out.println("**********************************1");
  
      // NOTE: Like arrays, 2D arrays are technically objects.
      System.out.println(squares);
      System.out.println("**********************************2");
  
      /*
       * The square brackets [row][col] are used
       * to access and modify an element in a 2D array.
       */
      squares[2][0] = "O";
      print(squares);
      System.out.println("**********************************3");
      /*
       * 2D arrays can also be declared literally with initializer
       * lists.
       */
      String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
      print(board);
      System.out.println("**********************************4");
      /*
       * For the purposes of the exam, when accessing
       * the element at arr[first][second], the
       * first index is used for
       */
      board[0][1] = "X";
      print(board);
      System.out.println("**********************************5");
    }
  
    public static void print(String[][] arr) {
      /*
       * Nested iteration statements are used to
       * traverse and access all elements in a 2D array.
       * Since 2D arrays are stored as arrays of arrays,
       * the way 2D arrays are traversed using for
       * loops and enhanced for loops is similar to 1D
       * array objects.
       */
      for (String[] row : arr) {
        /*
         * The outer loop of a nested enhanced for
         * loop used to traverse a 2D array traverses
         * the rows. Therefore, the enhanced for loop
         * variable must be the type of each row, which
         * is a 1D array. The inner loop traverses a single
         * row. Therefore, the inner enhanced for
         * loop variable must be the same type as the
         * elements stored in the 1D array.
         */
        for (String col : row) {
          System.out.print("[" + col + "] ");
        }
        System.out.println();
      }
      System.out.println();
    }
  
    /*
     * Nested iteration statements can be written to
     * traverse the 2D array in “row-major order” or
     * “column-major order.”
     * 
     * “Row-major order” refers to an ordering of 2D
     * array elements where traversal occurs across
     * each row, while “column-major order” traversal
     * occurs down each column
     * 
     * EXCLUSION STATEMENT
     * 
     * 2D array objects that are not rectangular are
     * outside the scope of the course and AP Exam.
     */
  }