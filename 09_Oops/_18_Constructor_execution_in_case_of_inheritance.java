class Demox {

    int n, m ;

    public Demox(){
        System.out.println("Hey ..! I am Zero Parameter Constructor..");
    }

    public Demox(int a, int b){
        System.out.println("Hey ..! I am Parameter Constructor..");
        n = a ;
        m = b ;
    }
}

class Demoy extends Demox{

    int x, y ;
    public Demoy(){

        // super();
        // super(10,20);
        // this();
        // this(10,20);
        System.out.println("Hey ..! I am Zero Parameter Constructor..!");
    }

    public Demoy(int a, int b){
        
        // super();
        // super(10,20);
        // this();
        // this(10,20);
        System.out.println("Hey ..! I am Parameter Constructor..!");
        x = a ;
        y = b ;
    }
}



public class _18_Constructor_execution_in_case_of_inheritance {
    
    public static void main(String[] args) {
        
        Demoy dmo = new Demoy();

        // Demo2 d2 = new Demo2(10, 20);

    }
}