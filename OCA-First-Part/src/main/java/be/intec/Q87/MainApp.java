package be.intec.Q87;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainApp {
    public static void main(String[] args) {

        String date = LocalDateTime
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(date);

        //What is the result?

//        The problem is with format() method. If the parameter and function call was changed to:
//.format(DateTimeFormatter.ISO_DATE);
//
//        The output would be:
//        2014-05-04
    }
}
