package be.intec.Q99;

    class Vehicle{
        int x;
        Vehicle(){
            this(10);
        }
        Vehicle(int x){
            this.x=x;
        }

    }

    class Car extends Vehicle{
        int y;

        Car(){
            super();//x = 10, y =0 (in the qeustion cannot super() and this in the same time because both have to in the first line )
// this(20);//x = 10, y =20
        }

        Car(int y){
            this.y=y;
        }
        public String toString(){
            return super.x + " " + this.y;
        }

        public static class MainApp {

        public static void main(String[] args) {
            Vehicle y = new Car();
            System.out.println(y);
        }
    }

//        Answer D:
//
//        The reason is because the this() is used in the second line instead of the first.
//        However, super() should also be in the first line!
//        Therefore, the compilation fails because we cannot add both of them explicitly in the same constructor.
//            (i.e. you either add super() or this() ).
//        The main reason is because the compiler will add the super() for us implicitly.
//        So if you add super(), it will be a kind of duplicate.

}
