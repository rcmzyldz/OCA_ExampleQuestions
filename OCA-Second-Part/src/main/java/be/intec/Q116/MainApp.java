package be.intec.Q116;

public class MainApp {

    public static void main(String[] args) {

        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + ": " + check2.count);

    }


    static class Test {

        static int count = 0;
        int i = 0;

        public void changeCount(){
            while (i<5){
                i++;
                count++;
            }

        }
    }

    /*

    What is the result?
A. 10 : 10
B. 5 : 5
C. 5 : 10
D. Compilation fails


Answer A:

Because “count” is static, so its updated value is shared among all the instances, while “i” is an instance variable, so it is specific per instance.
*/
}

