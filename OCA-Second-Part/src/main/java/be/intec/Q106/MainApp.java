package be.intec.Q106;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        String myarray[];
        try {

            while (true) { //infinite loop so Exception in thread “main” java.lang.OutOfMemoryError: Java heap space

                myList.add("My string");
            }
        } catch (RuntimeException re) {

            System.out.println("caught RuntimeException");

        } catch (Exception e) {

            System.out.println("caught Exception");

        }
        System.out.println("Ready to use");

    }

    /*

    What is the result?
A. Execution terminates in the first catch statement, and caught a RuntimeException is printed to the console.
B. Execution terminates In the second catch statement, and caught an Exception is printed to the console.
C. A runtime error is thrown in the thread "main".
D. Execution completes normally, and Ready to use is printed to the console.
E. The code fails to compile because a throws keyword is required.

C is correct.

Exception in thread “main” java.lang.OutOfMemoryError
*/

}
