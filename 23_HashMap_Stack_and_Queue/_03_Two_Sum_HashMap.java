import java.util.HashMap;
import java.util.Scanner;

public class _03_Two_Sum_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        // Create a HashMap and first enter Key as array element and value as index of..
        // that element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        // create a result array to display the index of two number's
        int result[] = new int[2];

        // If Current is equal to the target ..
        for (int i = 0; i < n; i++) {
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
                break;
            } else if (map.containsKey(target - arr[i])) {
                // is teh elemnet non-repeatalble..
                if (map.get(target - arr[i]) > i) {
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two Sum Index value are : [" + result[0] + " , " + result[1] + "]");

        sc.close();
    }
}
