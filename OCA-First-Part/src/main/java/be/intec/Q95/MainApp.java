package be.intec.Q95;

public class MainApp {


    static class MyString{
        String msg;

        MyString(String msg){
            this.msg=msg;
        }

        public static void main(String[] args) {

            System.out.println("Hello "+ new StringBuilder("Java Se 8"));
            System.out.println("Hello "+ new MyString("Java Se 8"));

        }

    }



    }
//    result :
//    Hello Java Se 8
//    Hello P1.MyString@6cd8737

