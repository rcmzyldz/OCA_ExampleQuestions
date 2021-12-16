package be.intec.Q112;

public class MainApp {

  //  B
    public static void main(String[] args) {

        if(args[0].equals("Hello") ? false : true){   //it is true so print else “Failure”

            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
    /*
    And given the commands:
      javac Test.Java Java Test Hello
       What is the result?
       A. Success
       B. Failure
       C. Compilation fails.
       D. An exception is thrown at runtime


       Answer B:

A tricky smart question.
The ternary expression as a whole is in fact a boolean expression for the if statement.
 So in case the args[0].equals(“Hello”) is true,
  then the whole if statement will be “if(false)”, therefore, the “Failure will be printed.
       */
}
}
