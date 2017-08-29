import org.junit.Test;

import java.util.Locale;
import java.util.MissingResourceException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by lywar on 20.08.2017.
 */
public class ClocksTest {

    Clocks clocks = new Clocks();
    @Test
    public void getTimeOfDayTestMorning(){
        int hours = 6;

        assertEquals("morning",clocks.getTimeOfDay(hours));
    }

    @Test
    public void getTimeOfDayTestDay(){
        int hours = 15 ;
        assertEquals("day",clocks.getTimeOfDay(hours));
    }

    @Test
    public void getTimeOfDayTestEvening(){
        int hours = 22;
        assertEquals("evening",clocks.getTimeOfDay(hours));
    }

    @Test
    public void getTimeOfDayTestNight(){
        int hours = 0;
        assertEquals("night",clocks.getTimeOfDay(hours));
    }

    @Test
    public void getMessageTestMorning_en_US(){
        Locale locale = new Locale("en", "US");
        assertEquals("Good morning, World!", clocks.getMessage(locale, "morning"));
    }

    @Test
    public void getMessageTestDay_en_US(){
        Locale locale = new Locale("en", "US");
        assertEquals("Good day, World!", clocks.getMessage(locale, "day"));
    }

    @Test
    public void getMessageTestEvening_ru_RU(){
        Locale locale = new Locale("ru", "RU");
        assertEquals("Добрый вечер, Мир!", clocks.getMessage(locale, "evening"));
    }

    @Test
    public void getMessageTestNight_ru_RU(){
        Locale locale = new Locale("ru", "RU");
        assertEquals("Доброй ночи, Мир!", clocks.getMessage(locale, "night"));
    }

    @Test (expected = MissingResourceException.class)
    public void getMessageTestException(){
        Locale locale = new Locale("ru", "RU");
        assertEquals("Доброй ночи, Мир!", clocks.getMessage(locale, "xxx"));
    }
}