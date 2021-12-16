package be.intec.Q110;

public class MainApp {

    public static void main(String[] args) {
        Base b1=new DrivedB();
        Base b2=new DrivedB();
        Base b3=new DrivedB();
        b1=(Base)b3;
        Base b4 = (DrivedB)b3;

        b1.test();b4.test();
    }

}
  //  C
    class Base{
        public void test(){
            System.out.println("Base");
        }
    }
    class DrivedA extends Base{
        @Override
        public void test() {
            System.out.println("DrivedA");
        }
    }
    class DrivedB extends DrivedA {
        @Override
        public void test() {
            System.out.println("DrivedB");

        }

        /*

        Both castings happening in b1=(Base)b3;
         and Base b4=(DerivedA)b3; are legal,
         because we are casting to the Base type or one of its subclasses
          (i.e. in this case DerivedA). However, in both cases casting is not doing anything extra.
         So both b1 and b4 are pointing to an object of type DerivedB.
         Therefore, when we calling the test method of b1 and b4,
         we are actually accessing the overriding method in the DerivedB.


         What is the result?
A. Base
DerivedA
B. Base
DerivedB
C. DerivedB
DerivedB
D. DerivedB
DerivedA
E. A classcast Except ion is thrown at runtime.

            */

    }


