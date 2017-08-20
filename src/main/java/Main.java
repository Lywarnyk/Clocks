import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by lywar on 20.08.2017.
 */
public class Main {

    private static final Logger log = Logger.getLogger((Main.class.getSimpleName()));


    public static void main(String[] args) {

        log.info("The program is started.");

        Calendar calendar = new GregorianCalendar();
        int hours  = calendar.get(Calendar.HOUR_OF_DAY);
        Locale locale = Locale.getDefault();

        log.info("Used data:  Hours = " + hours +" locale = "+ locale);

        Clocks clocks = new Clocks();
        System.out.println(clocks.getMessage(locale, clocks.getTimeOfDay(hours)));

        log.info("The program is finished.");

    }
}
