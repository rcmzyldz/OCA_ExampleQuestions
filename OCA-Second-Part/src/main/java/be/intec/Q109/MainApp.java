package be.intec.Q109;

public class MainApp {

    //package 1;
    class Acc {

        int p;

        private int q;

        protected int r;

        public int s;

    }

    //package p2;
   // import p1.Acc;

    class Test extends Acc {
        public void main(String[] args) {

            Acc obj = new Test();

            /*

             Which statement is true?

             A. Both p and s are accessible by obj.
             B. Only s is accessible by obj.
             C. Both r and s are accessible by obj.
             D. p, r, and s are accessible by obj.


             Answer B:

The “obj” is a reference of super class type (i.e. Acc) pointing to an instance of the child (i.e. Test). So the following is applicable:
* access to public variables (i.e. s) of the super class: in all cases.
* access to private variables (i.e. q) of the super class: not possible from outside the super class.
* access to default variables (i.e. p) of the super class: possible only to classes in the same package of the super (i.e. p1).
* access to protected variables (i.e. r) of the super class: possible only to classes in the same package of the super
 as well as to classes that extends the super.

So “obj” have access only to public variables. Special note about the protected variable,
 “obj” cannot access it because “obj” is located in a child class in another package,
  and obj is of super class type (not of child class type). So since it is neither in the same package,
   nor of the child type, then it does not has access to protected variables of the super class.

*/
        }

    }

}
