interface Dog{
    void dog();
}

interface Parrot{
    void parrot();
}


class Animal implements Dog, Parrot {

    @Override
    public void dog(){
        System.out.println("I am Dog ..!");
    }

    @Override
    public void parrot(){
        System.out.println("I am Parort..!");
    }
}


public class _04_Implementation_of_Interface {
    
    public static void main(String[] args) {
        
        Animal Ani = new Animal();

        Ani.dog();
        Ani.parrot();
    }
}
