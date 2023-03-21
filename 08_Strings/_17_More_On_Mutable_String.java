public class _17_More_On_Mutable_String {
    
    public static void main(String[] args) {
        
        StringBuilder strBd = new StringBuilder();

        System.out.println(strBd.capacity());
        strBd.append("Priyanshu K Gour"); // 16 character appended in strBd
        System.out.println(strBd.capacity());
        strBd.append("PG"); // 1 More character appended in strBd it mean total character in strBd is 17
        System.out.println(strBd);
        System.out.println(strBd.capacity()); // Formula of capacity = (current capacity+1) * 2 

        // capacity(); :- How many character you can add .
        // length();   :- How many character are present .

        StringBuilder strBd1 = new StringBuilder("hello");

        System.out.println(strBd1);
        System.out.println(strBd1.capacity()); // int this case the capacity is (how many character you add in starting + 16) 
        System.out.println(strBd1.charAt(4));

        strBd1.setCharAt(0, 'H');
        System.out.println(strBd1);


        StringBuffer strBf = new StringBuffer(200) ;  // we pass number in form of integer then the number is not string or number it work as a capacity() and the default capacity is 16 so change 16 to 200 ;
        System.out.println(strBf.capacity());
        strBf.append("I am Priyanshu Gour !");
        System.out.println(strBf);
        strBf.trimToSize();  // in this method the remaing capacity was trimed .. 
        System.out.println(strBf.capacity());



        StringBuffer strBf1 = new StringBuffer("Priyanshu");
        System.out.println(strBf1);
        strBf1.reverse();
        System.out.println(strBf1);
    }
}
