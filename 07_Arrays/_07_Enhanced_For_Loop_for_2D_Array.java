public class _07_Enhanced_For_Loop_for_2D_Array {
    
    public static void main(String[] args) {
        
        int nums[][] = {{1,2,3,4,5},{5,4,3,2,1},{7,8,9,8,7}};

        for(int a[] : nums){
            for(int b : a){
                System.out.print(b + ", ");
            }
            System.out.println();
        }
    }
}
