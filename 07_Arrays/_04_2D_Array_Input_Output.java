public class _04_2D_Array_Input_Output {
    
    // For Output Int  
    public static void printArray(int arr[][], int n1, int n2){

        for(int i = 0 ; n1 > i ; i++){

            for(int j = 0 ; n2 > j ; j++){
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String strings[][] = {{"foo", "bar", "baz"}, {"hello", "world", "java"}};

        for(int i = 0 ; 2 > i ; i++){

            for(int j = 0 ; 3 > j ; j++){
                System.out.print(strings[i][j] + ", ");
            }
            System.out.println();
        }


        int nums[][] = new int[3][3];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = count++;
            }
        }

        printArray(nums,3,3);

    }
}
