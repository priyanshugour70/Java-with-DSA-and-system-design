class I {

    public void Show(){
        System.out.println("Hey ..! I am Show..");
    }

    static class J {
        public void Display(){
            System.out.println("Hey ..! I am Display..");
        }
    }
}


public class _11_StaticClass {
    public static void main(String[] args) {
        
        I i = new I();

        I.J j = new I.J();

        i.Show();
        j.Display();
    }
}
