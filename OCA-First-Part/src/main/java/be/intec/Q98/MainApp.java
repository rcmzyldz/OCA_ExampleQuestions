package be.intec.Q98;

public class MainApp {

    public static void main(String[] args) {

        String array[] = new String[2];

        int idx=0;

        for(String s:array){array[idx].concat("Element"+idx);// throw java.lang.NullPointerException
            idx++;}

        for(idx=0;idx<array.length;idx++){

            System.out.println(array[idx]);//null null
        }
    }
  //  so result D
}
