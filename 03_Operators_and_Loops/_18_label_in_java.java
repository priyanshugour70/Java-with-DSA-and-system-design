public class _18_label_in_java {
    

    public static void main(String args[]){


        // In Java, a label is an identifier that can be used to mark a specific point in the code. Labels are typically used in conjunction with loops or conditional statements to specify a target point for control flow statements like break and continue.

        // Here's an example of how labels can be used in Java:
        outerloop:
        for (int i = 0; i < 10; i++) {
          innerloop:
          for (int j = 0; j < 10; j++) {
            if (i == 5 ) {
              break outerloop; // break out of the outerloop
            }else if(j == 5){
                continue innerloop ; // continue of the innerloop
            }
            System.out.println("i: " + i + ", j: " + j);
          }
        }
        
    }
}
