// <T> :- It Shows the Type of Our Class... 
class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    void disp() {
        System.out.println("Type of the Data is : " + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}

public class _14_More_On_Generics {
    public static void main(String[] args) {

        Gen<String> gen = new Gen<String>("Priyansu Gour");

        gen.disp();
        System.out.println(gen.getObj());

        Gen<Integer> gen1 = new Gen<Integer>(500);

        gen1.disp();
        System.out.println(gen1.getObj());
    }
}
