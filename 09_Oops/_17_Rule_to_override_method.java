class clap {
    void Hey(){
        System.out.println("hey .. I am Hey..! in parent calss");
    }
}


class childClap extends clap{


    // Rule No.1 : in Override case always increse visibility (mean Public => protected => default => Private Never Decrese the visibility in Override.   
    // Rule No.2 : Never Change the Datatype in Override case .  

    @Override
    public void Hey(){
        System.out.println("hey .. I am Hey..! in child class");
    }
}

public class _17_Rule_to_override_method {
    
    public static void main(String[] args) {
        
        childClap cc = new childClap();

        cc.Hey();

    }
}
