package be.intec.Q77;



public class MainApp {

    interface Readable {
       public  void readBook();
       public void setBookMark();

    }

    abstract class Book implements Readable{    //line n1
     //   public void readBook{   }
        //line n2

    }

    class EBook extends Book{     //line n3

        @Override
        public void readBook() {   }

        //line n4

        /* here is missing in de question*/
        @Override
        public void setBookMark() {

        }


    }
}
