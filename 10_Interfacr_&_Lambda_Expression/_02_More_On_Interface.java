interface A {
    void Show();
}

interface B {
    void Disp();
}

class C implements A,B{

    @Override
    public void Show(){
        System.out.println("I am Show..!");
    }

    @Override
    public void Disp(){
        System.out.println("I am Disp..!");
    }
}

public class _02_More_On_Interface {
    public static void main(String[] args) {
        

        C c = new C();

        c.Show();
        c.Disp();

    }
}
