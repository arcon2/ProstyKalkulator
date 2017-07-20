import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


/**
 * Created by Arcon on 2017-07-16.
 */
public class Kalendarz
{
    public static void main(String[] args)
    {
        GregorianCalendar d = new GregorianCalendar();

        int today =d.get(Calendar.DAY_OF_MONTH);
        int month =d.get(Calendar.MONTH);

        //Ustawienie d na początek miesiąca
        d.set(Calendar.DAY_OF_WEEK, 1);

        int weekday =d.get(Calendar.DAY_OF_WEEK);

        //Pobranie pierwszego dnia tygodnia Poniedziałek w polsce
        int firstDayOfWeek = d.getFirstDayOfWeek();


        //Drukowanie nazwy dni tygodnia
        //String[] weekdayName = new DateFormatSymbols().getShortWeekdays();
        String[] weekdayName = new DateFormatSymbols().getWeekdays();
        do
        {
            System.out.printf("%4S", weekdayName[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }
        while (weekday !=firstDayOfWeek);
        System.out.println();
        System.out.println(new Date());


    }
}
