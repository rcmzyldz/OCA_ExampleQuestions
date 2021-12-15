package be.intec.Q96;

public class MainApp {


    public static void main(String[] args) {
        int ivar = 100;
        float fvar=100.100f;
        double dvar = 123;
      //  ivar=fvar;//not compile until cast to (int)
        fvar=ivar;
        dvar=fvar;
     //   fvar=dvar;//not compile until cast to (float)
        dvar=ivar;
      //  ivar=dvar;//not compile until cast to (int)

    }
   // the small cannot contain the big primitives
    //
}
