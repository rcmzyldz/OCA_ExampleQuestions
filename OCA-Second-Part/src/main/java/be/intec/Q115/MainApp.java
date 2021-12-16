package be.intec.Q115;

public class MainApp {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Duke");
        String str1 = sb.toString();
        String str2 = str1;

        //insert code here
        System.out.println(str1==str2);

        /*
        Which code fragment, when inserted at line 9, enables the code to print true?
A. String str2 = str1;
B. String str2 = new String (str1);
C. String str2 = sb1. toString ();
D. String str2 = "Duke";

Answer A:

The str1 has a string value, but it is not literal.
 Therefore, this “Duke” will not be pooled in the string pool.
 Accordingly, the (==) operator will examine reference equality.
  So only option A is correct.
*/
    }

}
