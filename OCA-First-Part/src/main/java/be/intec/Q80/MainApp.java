package be.intec.Q80;

public class MainApp {

    abstract class Planet {
        protected void revolve() {     //line n1

        }

        abstract void rotate();    //line n2
    }

    class Earth extends Planet {
       /* protected, public */
//        void revolve() {                 //line n3
//       }


        protected void rotate() {      //line n4

        }
    }




    }
