// Single-Level Inheritance

class Animal { // Parent Class

    void sleep(){
        System.out.println("Animal want sleep Atlest 5 Hours in a Day...");
    }
}

class Lion extends Animal{ // Child Class

    void disp(){
        System.out.println("I am Lion..");
    }
}


public class _10_Types_Of_Inheritance {
    
    public static void main(String[] args) {
        
        Lion L = new Lion() ;

        L.sleep() ;
        L.disp() ;
    }
}
