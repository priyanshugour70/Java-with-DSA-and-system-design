class Car {
    private String make;
    private String model;
    private int year;
    
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make ;
    }
    public String getModel(){
        return model ;
    }
    public int getYear(){
        return year ;
    }
}


public class _04_Introduction_to_Constructor {
    
    public static void main(String[] args) {
        Car c = new Car("Tesla", "Electric", 2023);

        c.getMake();
    }
}
