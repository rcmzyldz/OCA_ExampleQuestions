package be.intec.Q111;

public class MainApp {

    public static void main(String[] args) {


            double discount = 0;

            int qty = Integer.parseInt(args[0]);


//A
// if(qty>=90){discount=0.5;}
// if(qty >80 && qty=90 ? 0.5 : (qty>80)? 0.2 : 0 );


            System.out.println(discount);
        }

        /*
        And given the requirements:
        * If the value of the qty variable is greater than or equal to 90,
        *  discount = 0.5 If the value of the qty variable is between 80 and 90,
        *  discount = 0.2 Which two code fragments can be independently placed at line n1
        *  to meet the requirements?*/


    /*
    Answer A, C:

B and D are not correct because there is two conditional statements
 and in each one there is an else statement that is assigning the value of discount to 0.
  While D is not correct because the (qty >= 90) is unreachable and would always equal to false.
  */
}
