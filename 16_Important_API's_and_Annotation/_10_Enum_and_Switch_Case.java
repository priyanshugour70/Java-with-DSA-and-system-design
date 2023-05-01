enum Result12 {
    PASS, FAIL, NR;
}

public class _10_Enum_and_Switch_Case {
    public static void main(String[] args) {

        Result12 res = Result12.PASS;
        // Result12 res = Result12.FAIL;
        // Result12 res = Result12.NR;

        switch (res) {
            case PASS: {
                System.out.println("Passed !");
                break;
            }
            case FAIL: {
                System.out.println("Failed ..!");
                break;
            }
            case NR: {
                System.out.println("No Result12 ..!");
            }
        }
    }
}
