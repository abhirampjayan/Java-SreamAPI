package dateapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Dateapi {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(1998, Month.APRIL,30);
        System.out.println(d);
        LocalTime t=LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println(t);
    }
}
