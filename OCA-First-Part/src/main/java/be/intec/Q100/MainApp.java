package be.intec.Q100;

public class MainApp {

    public static void main(String[] args) {

        String s =" ";
        s.trim();
        System.out.println(s.equals("") + " "+s.isEmpty());

    }

     //C: false false
    //the str.trim() got ignored (i.e. has not been saved to any variable. So str remains as it is.
    //An empty space in a string (i.e. ” “) is actually filled with a blank character,
    // meaning that this String is not empty.
}
