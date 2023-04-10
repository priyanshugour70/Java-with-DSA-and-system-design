import java.util.*;


abstract class Shape{

    float area ;

    abstract public void input();
    abstract public void compute();

    public void disp(){
        System.out.println("The Area is : " + area);
    }
}


class Rectangle extends Shape{

    float length ;
    float breadth ;

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lets Find the Area of Rectangle : ");
        
        System.out.print("Enter Length of the Rectangle : ");
        length = sc.nextFloat();

        System.out.print("Enter Breadth of the Rectangle : ");
        breadth = sc.nextFloat();

        sc.close();
    }

    @Override
    public void compute(){
        area = length * breadth ;
    }

    
}


class Square extends Shape{

    float length ;

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lets Find the Area of Square : ");
        
        System.out.print("Enter Length of the Square : ");
        length = sc.nextFloat();

        sc.close();
    }

    @Override
    public void compute(){
        area = length * length ;
    }

    
}


class Circle extends Shape{

    float radius ;

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lets Find the Area of Circle : ");
        
        System.out.print("Enter Radius of the Circle : ");
        radius = sc.nextFloat();

        sc.close();
    }

    @Override
    public void compute(){
        area = 3.14f * radius * radius ;
    }

    
}


class Geometry{

    public void poly(Shape ref){

        ref.input();
        ref.compute();
        ref.disp();

    }
}




public class _27_Advance_Oops {
    
    public static void main(String[] args) {
        

        Shape sR = new Rectangle();
        Shape sS = new Square();
        Shape sC = new Circle();

        Geometry geo = new Geometry();

        geo.poly(sR);
        geo.poly(sS);
        geo.poly(sC);

        
        // sR.input();
        // sR.compute();
        // sR.disp();

        // sS.input();
        // sS.compute();
        // sS.disp();

        // sC.input();
        // sC.compute();
        // sC.disp();

    }
}
