package be.intec.Q105;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainApp {

    static class Person {
        String name;
        int age;

        Person(int a,String n) {
            name = n;
            age = a;

        }

        public Person() {

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

//
//    public static <Person> void checkAge(List list, Predicate predicate) {
//        for (Person p :list){
//
//            if(predicate.test(p) ){
//
//                System.out.println(p.name + "");
//            }
//        }
//
//    }






    public static void main(String[] args) {

        Person p = new Person();

//        List iList= Arrays.asList(new Person(45,"Hank"),
//                                  new Person(40,"Charlie"),
//                                  new Person(38,"Smith"));
        // line n1
//        checkAge(iList,p->(p.getAge()>40));

    }

    /*
    Which code fragment, when inserted at line n1, enables the code to print Hank?

    A. checkAge (iList, ( ) -> p. get Age ( ) > 40);
    B. checkAge(iList, Person p -> p.getAge( ) > 40);
    C. checkAge (iList, p -> p.getAge ( ) > 40);
    D. checkAge(iList, (Person p) -> { p.getAge() > 40; });


    * Answer C:

     Mainly because other options have syntax errors.*/
}
