class DC {
    public void charater(){
        System.out.println("Multipul Character..!");
    }
    public void Feature(){
        System.out.println("Multipul Feature..!");
    }
}

class Batman extends DC{
    @Override
    public void charater(){
        System.out.println("I am Batman..!");
    }
    @Override
    public void Feature(){
        System.out.println("Unlimited Money..! ");
    }
}

class Superman extends DC{
    @Override
    public void charater(){
        System.out.println("I am Superman..!");
    }
    @Override
    public void Feature(){
        System.out.println("Unlimited Strength..! ");
    }
}


class Wonderwomen extends DC{
    @Override
    public void charater(){
        System.out.println("I am Wonderwomen..!");
    }
    @Override
    public void Feature(){
        System.out.println("Amazon Queen..! ");
    }
}



// this class is manily focus on Polymorphism ..
class dc {
    public void poly(DC ref){
        ref.charater();
        ref.Feature();

        System.out.println("--------------------------------------------");
    }
}


public class _21_More_On_Polymorphism {
    
    public static void main(String[] args) {
        
        DC dscf = new DC();
        Batman bm = new Batman();
        Superman sm = new Superman();
        Wonderwomen ww = new Wonderwomen();

        dc d = new dc();

        d.poly(dscf);
        d.poly(bm);
        d.poly(sm);
        d.poly(ww);


    }
}
