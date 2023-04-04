// Multi-Level Inheritance..

class Demo1 {

    void disp1(){
        System.out.println("I am Demo 1");
    }
}

class Demo2 extends Demo1 {

    void disp2(){
        System.out.println("I am Demo 2");
    }
}

class Demo3 extends Demo2{

    void disp3(){
        System.out.println("I am Demo 3");
    }
}

public class _11_Multi_Level_Inheritance {
    
    public static void main(String[] args) {
        
        Demo3 D = new Demo3() ;

        D.disp1();
        D.disp2();
        D.disp3();
    }
}
