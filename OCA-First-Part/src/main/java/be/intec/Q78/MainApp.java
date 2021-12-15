package be.intec.Q78;

public class MainApp {

    public static void main(String[] args) {

        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta.concat(tb);
        ta.replace('C', 'D'); //Burayi atamiyor yeni stringe
        ta = ta.concat(tb);
        System.out.println(ta);

        //ABCC

    }
}
