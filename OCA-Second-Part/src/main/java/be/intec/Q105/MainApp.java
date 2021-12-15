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

//        List iList= Arrays.asList(new Person(45,"Hank"),new Person(40,"Charlie"),new Person(38,"Smith"));
//        checkAge(iList,p->(p.getAge()>40));
    }

    /*
    * Answer C:

     Mainly because other options have syntax errors.*/
}
