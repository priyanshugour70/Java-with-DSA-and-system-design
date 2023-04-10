class Car {

    private Engine eng ;

    public Car(Engine eng){
        this.eng = eng ;
    }

    public void start(){
        eng.CarEngine();
    }

}


class Engine {

    public void CarEngine(){
        System.out.println("This is the Engine of the Car...!");
    }

}


public class _29_Dependency_Injection_ex1 {
    
    public static void main(String[] args) {
        

        Engine e = new Engine();

        Car c = new Car(e);
        c.start();
    }
}
