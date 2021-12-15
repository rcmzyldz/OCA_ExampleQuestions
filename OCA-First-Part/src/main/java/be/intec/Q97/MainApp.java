package be.intec.Q97;

public class MainApp {



    public static void main(int[] args) {

        System.out.println("int main"+args[0]);

    }
    public static void main(Object[] args) {

        System.out.println("Object main "+args[0]);

    }
    public static void main(String[] args) {

        System.out.println("String main "+args[0]);

    }

    //result
//  C. String main 1
    //Other main methods are overloaded, but they would never act as the starting point of the app.

}


