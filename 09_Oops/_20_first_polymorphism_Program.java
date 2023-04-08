class Marvel{

    public void Stdio(){
        System.out.println("Marvel is a an Stdio..!");
    }
    public void Writer(){
        System.out.println("Writer of the marvel is Stainle..!");
    }
}

class IronMan extends Marvel{
    @Override
    public void Stdio(){
        System.out.println("IronMan is a part of Marvel Stdio..!");
    }
    @Override
    public void Writer(){
        System.out.println("Stainle is writer of the IronMan..!");
    }
}


class Captain extends Marvel{
    @Override
    public void Stdio(){
        System.out.println("Captain is a part of Marvel Stdio..!");
    }
    @Override
    public void Writer(){
        System.out.println("Stainle is writer of the Captain..!");
    }
}



public class _20_first_polymorphism_Program {
    
    public static void main(String[] args) {
        
        IronMan Im = new IronMan();

        Captain Ca = new Captain();

        // In polymorphism always refers Parents class never refer child..
        Marvel Mr ;

        Mr = Im ; // it is known as Polymorphism..

        Mr.Stdio();
        Mr.Writer();



        System.out.println("-------------------------------------------------------------");



        Mr = Ca ; // it is known as Polymorphism..


        Mr.Stdio();
        Mr.Writer();
    }
}
