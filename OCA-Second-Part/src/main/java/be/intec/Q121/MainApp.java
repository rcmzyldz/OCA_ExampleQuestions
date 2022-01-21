package be.intec.Q121;

public class MainApp {

    public static void main(String[] args) {

        /*insert code here*/

        int[] array = new int[2];  // here is missing
        array[0] = 10;
        array[1] = 20;

        System.out.println(array[0] + " : " + array[1]);

        /*
        Which code fragment, when inserted at line 3, enables the code to print 10:20?
             A. int[] array = new int[2];
             B. int[] array; array = int[2];
             C. int array = new int[2];
             D. int array [2] ;


            It should be A
             */
    }
}
