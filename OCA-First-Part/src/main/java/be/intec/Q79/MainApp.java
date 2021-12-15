package be.intec.Q79;

public class MainApp {

    class CD {
        int r;
        CD(int r){
            this.r = r;
        }

        CD(){}  //Soruda burasi eksik
    }

     class DVD extends CD{
        int c;
        DVD(int r, int c) {

            // line n1
            super(); // Soruda burasi eksik
           this.c = c;
        }


    }
    public static void main(String[] args) {
      // DVD dvd = new DVD(10, 20);

    }

}
