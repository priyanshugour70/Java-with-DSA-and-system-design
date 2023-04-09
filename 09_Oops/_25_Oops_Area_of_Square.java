import java.util.Scanner;

class Square{

    float length ;
    float area ;

    public void input(){
        System.out.println("Calculation of Square App : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        length = sc.nextFloat();

        sc.close();
    }

    public void compute(){
        area = length * length ;
    }

    public void disp(){
        System.out.println("Area of Square is : " + area);
    }

}



public class _25_Oops_Area_of_Square {
    
    public static void main(String[] args) {
        
        
        Square sqr = new Square();

        sqr.input();
        sqr.compute();
        sqr.disp();
    }
}
