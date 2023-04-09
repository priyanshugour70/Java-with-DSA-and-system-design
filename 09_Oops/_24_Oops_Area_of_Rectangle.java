import java.util.Scanner;

class Rectangle{

    float length ;
    float breadth ;
    float area ;

    public void input(){
        System.out.println("Calculation of Rectangle App : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        length = sc.nextFloat();

        System.out.print("Enter the Breadth : ");
        breadth = sc.nextFloat();

        sc.close();
    }

    public void compute(){
        area = length * breadth ;
    }

    public void disp(){
        System.out.println("Area of Rectangle is : " + area);
    }

}


public class _24_Oops_Area_of_Rectangle {

    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();

        rec.input();
        rec.compute();
        rec.disp();
    }
}