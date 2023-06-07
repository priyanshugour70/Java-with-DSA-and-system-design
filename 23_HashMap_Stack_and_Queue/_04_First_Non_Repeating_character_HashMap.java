import java.util.*;

public class _04_First_Non_Repeating_character_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Constructing the Hashtable..
        // Key -> unique Characters in the String ..
        // value -> frequency of the character in the String ..

        for (int i = 0; str.length() > i; i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; map.size() - 1 > i; i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("First Non Repeating Character is : " + str.charAt(i));
                break;
            }
        }

        sc.close();
    }
}
