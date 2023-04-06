class Aero1{
    void Flying(){
        System.out.println("Flying the Aeroplane ..!");
    }

    void TakeOff(){
        System.out.println("TakeOff the Aeroplane ..!");
    }
}

class AeroChild3 extends Aero1{
    void CarryPassenger1(){
        // Specialized methods
        System.out.println("I Have a Multipule Passeger in my Aerochild3");
    }
}

class AeroChild4 extends Aero1{
    void CarryPassenger2(){
        // Specialized methods
        System.out.println("I Have a Multipule Passeger in my Aerochild4");
    }
}


public class _15_Types_Of_Method_Specizlized {
    
    public static void main(String[] args) {
        

        // Specialized methods: Specialized methods are the methods that are defined in the child class and are not present in the parent class. These methods provide specialized functionality to the child class.

        AeroChild3 ac3 = new AeroChild3();
        ac3.Flying();
        ac3.TakeOff();
        ac3.CarryPassenger1();

        AeroChild4 ac4 = new AeroChild4();
        ac4.Flying();
        ac4.TakeOff();
        ac4.CarryPassenger2();

    }
}
