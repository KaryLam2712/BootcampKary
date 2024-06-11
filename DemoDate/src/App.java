import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args)  {
        //17 types (8 primitives + 8 wrapper class + String)
        // similar to vauleOf
        LocalDate ld = LocalDate.of(2022,12,31);
        System.out.println(ld); // 2022-12-31
//LocalDate ld2= LocalDate.of (2022,12,32) // Java.time.DateTimeEXception
      System.out.println(ld.plusDays(1L));
      System.out.println(ld.plusMonths(3L));
      System.out.println(ld.plusYears(1L));
      System.out.println(ld.minusDays(3L));

      Month month = ld.getMonth();
      String monthString = month.toString();
      System.out.println(ld.getMonth());

      System.out.println(ld.getDayOfMonth());
      System.out.println(ld.getDayOfMonth());
      

    }
}
