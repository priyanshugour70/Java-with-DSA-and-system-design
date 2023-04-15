interface P {

    void name();
}

public class _13_AnnonymousInnerClass {
    public static void main(String[] args) {
        
        P p = new P() {
            public void name (){
                System.out.println("hey I am Priyanshu Gour");
            }
        };

        p.name();
    }
}
