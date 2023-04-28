import java.util.*;

public class _12_Introduction_to_Generics {

    // Generics in Java allow classes, methods, and interfaces to be parameterized
    // by type. This means that we can create a single class or method that can be
    // used with different types of data.

    // ● It was introduced from JDK 5. Generics is a feature in Java that allows for
    // the creation of classes, interfaces, and methods that can operate on a
    // variety of data types.
    // ● It provides compile-time type safety by enabling the specification of the
    // data type of objects that a class or method can work with.
    // ● Generics are implemented using type parameters, which are specified inside
    // angle brackets <>.

    public static void main(String args[]) {

        // TypeSafety (Simple Array)
        String ar[] = new String[10];
        ar[0] = "Priyanshu Gour";
        ar[1] = "Devanshu Gour";
        ar[2] = "Harshita Gour";
        ar[3] = "Suharni Gour";
        // ar[4] = 1221 ; // we can't add this because String can't add Int.

        String str0 = ar[0];
        String str1 = ar[1]; // we can add becuase it is String and we add String type in String .
        System.out.println("-------------------------------------------------------------------------");

        // No TypeSafety
        ArrayList al = new ArrayList();

        al.add("Priyanshu");
        al.add("Devanshu");
        al.add("Harshita");
        al.add("Suhani");
        al.add(18);

        Object obj = al.get(0);
        System.out.println(obj); // we want to store the data of ArrayList then we store data in Object form.

        // If we want to Store in form of String then we use this .
        String str2 = (String) al.get(0); // using TypeCasting or DownCasting
        // String str3 = (String) al.get(4); // in this Line gives a RunTime Exception
        // because we add int as a String.
        System.out.println(str2);

        System.out.println("-------------------------------------------------------------------------");

        // TypeSafety in Collection in Java.
        ArrayList<String> al1 = new ArrayList<String>();

        al1.add("Priyanshu");
        al1.add("Devanshu");
        al1.add("Harshita");
        al1.add("Suhani");
        // al1.add(18); // It Shows Compiling Error

        String str5 = al1.get(0);
        String str6 = al1.get(1);
        System.out.println(str5 + " | " + str6);
    }
}
