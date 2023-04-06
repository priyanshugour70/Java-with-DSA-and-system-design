class Aeroplane{

    void fly(){
        System.out.println("AeroPlane is Flying ..! ");
    }
    void TackOff(){
        System.out.println("AeroPlane is TakeOff ..!");
    }
}


class CargoPlane extends Aeroplane{

}

class PassengerPlane extends Aeroplane{

}


public class _13_Types_Of_Method_Inherited {
    
    public static void main(String[] args) {
        

        // Inherited methods: Inherited methods are the methods that are inherited from the parent class to the child class. These methods are available to the child class without any need to redefine them. The child class can use these methods as they are or can also override them if needed.

        
        CargoPlane cp = new CargoPlane() ;
        cp.fly();
        cp.TackOff();

        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.TackOff();
        
    }
}
