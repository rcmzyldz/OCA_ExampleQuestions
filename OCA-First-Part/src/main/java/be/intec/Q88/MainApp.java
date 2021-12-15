package be.intec.Q88;

public class MainApp {

    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;            //line n1
      //  String s4 = (String) (s3 * s2);     // line n2

      //  System.out.println("Sum is " + s4);

       // What is the result?

//        The correct answer is C.
//
//                Output is:
//        Exception in thread “main” java.lang.Error: Unresolved compilation problem:
//        Cannot cast from long to String
//
//        Note that the error sites a compilation problem, not a ClassCastException.
    }
}
