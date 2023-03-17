import java.util.Scanner;

public class _03_Array_Input_Output_using_methods {

    // For input 
    public static void inputArray(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ; n > i ; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    // For Output
    public static void printArray(int arr[], int n){

        for(int i = 0 ; n > i ; i++){
            System.out.println(arr[i]);
        }
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.println("What is the Size of the Array : ");
        n = sc.nextInt();

        int arr[] = new int[n];

        inputArray(arr, n);
        printArray(arr, n);

        sc.close();
    }
}
