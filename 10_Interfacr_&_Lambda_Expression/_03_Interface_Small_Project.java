interface Computer{
    void compileCode();
}


class Desktop implements Computer {
    @Override
    public void compileCode(){
        System.out.println("You got 5 Errors..!, But It is Faster..");
    }
}

class Laptop implements Computer {
    @Override
    public void compileCode(){
        System.out.println("You got 5 Errors..!");
    }
}


class Devloper{

    public void buildApp(Computer ref){
        System.out.println("Building App..!");
        ref.compileCode();
    }
}

public class _03_Interface_Small_Project {
    
    public static void main(String[] args) {
        
        Computer dec = new Desktop();
        // Computer dec = new Laptop();

        Devloper dev = new Devloper();
        dev.buildApp(dec);
    }
}