package be.intec.Q94;

public class MainApp {

    static class Person {
        String name;
        int age = 25;



        public Person(String name) {
        //    this();                    //line n1
            setName(name);
        }

        public Person(String name, int age) {
           // Person (name);               //line n2
            setAge(age);
        }
        //setters and getters go here

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String show() {
            return name + " " + age + " " ;
        }


    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }



    //Compilation fails at both line n1 and line n2

    //Answer:D
}
