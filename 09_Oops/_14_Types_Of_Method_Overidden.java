class Aero{

    void Flying(){
        System.out.println("Flying the Aeroplane ..!");
    }

    void TakeOff(){
        System.out.println("TakeOff the Aeroplane ..!");
    }
}

class AeroChild1 extends Aero{

    @Override // Overidden
    void Flying(){
        System.out.println("AeroChild1 in the Aeroplane ..!");
    }

}

class AeroChild2 extends Aero{

    @Override // Overidden
    void Flying(){
        System.out.println("AeroChild2 in the Aeroplane ..!");
    }
    
}


public class _14_Types_Of_Method_Overidden {
    
    public static void main(String[] args) {
        

        // Overriding methods: Overriding methods are the methods that are defined in the child class with the same name as that of the parent class. The purpose of overriding is to provide a specific implementation of the method in the child class.

        AeroChild1 ac1 = new AeroChild1();
        ac1.Flying();
        ac1.TakeOff();
        
        AeroChild2 ac2 = new AeroChild2() ;
        ac2.Flying();
        ac2.TakeOff();
    }
}
