class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super(msg);
    }
}

public class _07_Custom_Exception_And_Throw_Keyword {

    public static void main(String[] args) {

        int a = 10;
        int b = -5;

        int result = 0;

        try {
            if (b < 0) {
                Exception x = new MyException("Custom"); // also (new Exception("Negative Number.."))
                throw x; // throw Keyword
            } else {
                result = a / b;
                System.out.println(result);
            }
        } catch (Exception x) {
            System.out.println("In this program there is a an Error : " + x);
        }

    }
}
