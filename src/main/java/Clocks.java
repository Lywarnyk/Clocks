import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by lywar on 20.08.2017.
 */
public class Clocks {

    public String getMessage(Locale locale, String timeOfDay) {
        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", locale);
        return bundle.getString(timeOfDay);
    }

    public String getTimeOfDay(int hours) {
        String msg;
        if (hours>=6&& hours<9){msg = "morning";}
        else if (hours>=9&& hours<19){msg = "day";}
        else if (hours>=19&& hours<23){msg = "evening";}
        else {msg = "night";}
        return msg;
    }


}
