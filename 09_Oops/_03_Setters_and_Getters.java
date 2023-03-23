import java.lang.String;

class Student1{

    private String sName ;
    private String lName ;
    private String subName ;
    private int age ;

    // Setters..

    public void setSName(String sName){
        this.sName = sName ;
    }
    public void setLName(String lName){
        this.lName = lName ;
    }
    public void setSubName(String subName){
        this.subName = subName ;
    }
    public void setAge(int age){
        this.age = age ;
    }


    // Getters..

    public String getSName(){
        return sName ;
    }
    public String getLName(){
        return lName ;
    }
    public String getSubName(){
        return subName ;
    }
    public int getAge(){
        return age ;
    }
}

public class _03_Setters_and_Getters {
    
    public static void main(String[] args) {
        
        Student1 s = new Student1() ;

        s.setSName("Priyanshu");
        s.setLName("Gour");
        s.setSubName("Oops in java");
        s.setAge(18);

        String sName = s.getSName();
        System.out.println(sName);
        
        String lName =s.getLName();
        System.out.println(lName);
        
        String subName = s.getSubName();
        System.out.println(subName);
        
        int age = s.getAge();
        System.out.println(age);
    }
}
