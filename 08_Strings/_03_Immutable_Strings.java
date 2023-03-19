public class _03_Immutable_Strings {
    
    public static void main(String[] args) {
        
        // First way to Write String is : 
        String myName = "Gour" ;
        String myName1 = "Gour" ;
        System.out.println(myName +" "+ myName1);
            // System.out.println(myName == myName1) //true 
            // Duplicate Not-Allow which means if we recreate same value variable then both variable refer to one value.. 
            //   String  ==>  Object  ==> Heap (Memory Allocation)
            // 
            //      *        Heap       *
            //      * * * * * * * * * * *
            //      *                   *
            //      *                   *
            //      *                   *
            //      *  (String Constant *
            //      *      Pool)(SCP)   *
            //      *   *************   *
            //      *   *  Gour     *   *
            //      *   *           *   *
            //      *   *************   *
            //      *                   *
            //      * * * * * * * * * * *


        // Second way to Write String is : 
        String myName2 = new String("Gour");
        String myName3 = new String("Gour");
        System.out.println(myName2 +" "+ myName3);
            // System.out.println(myName2 == myName3) //true 
            // Duplicate Allow Which means if we recreate same value variable then both variable refer to different value..
            //   String  ==>  Object  ==> Heap (Memory Allocation)
            // 
            //      *        Heap       *
            //      * * * * * * * * * * *
            //      *   *************   *
            //      *   *  Gour     *   *
            //      *   *           *   *
            //      *   *************   *
            //      *                   *
            //      *                   *
            //      *  (String Constant *
            //      *      Pool)(SCP)   *
            //      *   *************   *
            //      *   *  Gour     *   *
            //      *   *           *   *
            //      *   *************   *
            //      *                   *
            //      * * * * * * * * * * *




        //  if we create using object String then the value is store in heap but out of (String Constant Pool (SCP)) but the one copy of String is also present in SCP also .. NoOne Variable refer this String but this is under the Garbage Collector... 

    }
}
