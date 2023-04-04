
// Hierarchical Inheritance.. 

class fly {

    void flying(){
        System.out.println("I am Flying Bird's..");
    }
}

class Bird1 extends fly{

    //  Hey ..! I am Bird 1
}

class Bird2 extends fly{

    // Hey ..! I am Bird 2
}

public class _12_Hierarchical_Inheritance {
    
    public static void main(String[] args) {
        
        Bird1 B1 = new Bird1() ;
        B1.flying();

        Bird2 B2 = new Bird2() ;
        B2.flying();

    }
}
