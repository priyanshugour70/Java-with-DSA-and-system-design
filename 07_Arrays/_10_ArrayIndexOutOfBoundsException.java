public class _10_ArrayIndexOutOfBoundsException {
    
    public static void main(String args[]){
        
        int nums[] = {1,2,3,4,5};

        System.out.println(nums[5]); // This is an Exception (ArrayIndexOutOfBoundsException) Because Index value is larger or outoff arrary size..

        System.out.println(nums[nums.length - 1 ]);  // This is a way to Handle this Exception

    }
}
