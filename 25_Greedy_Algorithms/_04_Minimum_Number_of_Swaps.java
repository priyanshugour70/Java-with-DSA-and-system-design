public class _04_Minimum_Number_of_Swaps {

    public static int minimumNumberOfSwaps(String s){
        int count = 0;
        int left = 0;
        int right = 0;
        int swap = 0;

        char arr [] = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '['){
                left++;
                if(swap > 0){
                    count += swap;
                    swap--;
                }
            }else{
                right++;
                swap = right - left;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println("Minimu Number of Swaps is : " + minimumNumberOfSwaps(s));
    }
}