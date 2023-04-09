import java.util.Scanner;

class Circle{

    float radius ;
    float area ;

    public void input(){
        System.out.println("Calculation of Circle App : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        radius = sc.nextFloat();

        sc.close();
    }

    public void compute(){
        area = 3.14f * radius * radius ;
    }

    public void disp(){
        System.out.println("Area of Circle is : " + area);
    }

}


public class _26_Oops_Area_of_Circle {
    
    public static void main(String[] args) {
        
        Circle cir = new Circle();
        cir.input();
        cir.compute();
        cir.disp();

    }
}
