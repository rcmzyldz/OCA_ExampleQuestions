package be.intec.Q120;

public class MainApp {

    int ns;
    static int s;

    public MainApp(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns " + ns + " " + " s " + s);
    }

    public static void main(String[] args) {

        MainApp ref1 = new MainApp(50);
        MainApp ref2 = new MainApp(125);
        MainApp ref3 = new MainApp(100);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();

        /* What is the result?

        Answer:
          ns 50  s 125
          ns 125  s 125
          ns 0  s 125
          */
    }
}
