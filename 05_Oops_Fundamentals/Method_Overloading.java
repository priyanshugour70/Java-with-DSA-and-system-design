class Calc {

    public int Add(int n1 , int n2 ){
        int result = n1 + n2 ;
        return result ;
    }

    public int Add(int n1, int n2, int n3){
        int result = n1 + n2 + n3 ;
        return result ;
    }

    public double Add(double n1 , double n2){
        double result = n1 + n2 ;
        return result ;
    }
}


public class Method_Overloading {
    
    public static void main(String args[]){

        Calc Sum = new Calc();

        int res1 = Sum.Add(5, 10);
        int res2 = Sum.Add(5, 10, 15);
        double res3 = Sum.Add(45.23, 54.77);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}
