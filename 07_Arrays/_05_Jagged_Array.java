public class _05_Jagged_Array {
    
    public static void main(String[] args) {

        // Jagged arrays are multidimensional arrays in Java where each row in the array can have a different length. This means that the elements in a row do not have to be the same as the elements in the other rows.

        int jaggedArray[][] = new int[3][];
        
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[4];
        
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        // Loop through the array and print each element
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + ", ");
            }
            System.out.println();
        }




        
        
        // Create a jagged array
        int jaggedArray1[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // Loop through the array and print each element
        for (int i = 0; i < jaggedArray1.length; i++) {
            for (int j = 0; j < jaggedArray1[i].length; j++) {
                System.out.print(jaggedArray1[i][j] + ", ");
            }
            System.out.println();
        }
        
    }
}
