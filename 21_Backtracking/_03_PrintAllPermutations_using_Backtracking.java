public class _03_PrintAllPermutations_using_Backtracking {
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    /*
     * str - input string
     * l - starting index
     * r - ending index
     */
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);

                // backtracking
                str = swap(str, l, i);
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "XY";
        int n1 = str1.length();
        System.out.println("Permutations for string : " + str1 + " are : ");
        permute(str1, 0, n1 - 1);
        System.out.println();

        String str2 = "ABC";
        int n2 = str2.length();
        System.out.println("Permutations for string : " + str2 + " are : ");
        permute(str2, 0, n2 - 1);
    }
}
