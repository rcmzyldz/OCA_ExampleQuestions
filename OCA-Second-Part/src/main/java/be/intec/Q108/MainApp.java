package be.intec.Q108;

public class MainApp {

    public static String maskCC(String creditCard){
        String x ="xxxx-xxxx-xxxx-";

        //line n1

        /*
        * You must ensure that the maskcc method returns a string that hides all digits of the credit card
        *  number except the four last digits (and the hyphens that separate each group of four digits).
        Which two code fragments should you use at line n1, independently, to achieve this requirement?*/
//C
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
//B
// return x + creditCard.substring(15,19);
    }
    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }

    //Answer B and C:
}
