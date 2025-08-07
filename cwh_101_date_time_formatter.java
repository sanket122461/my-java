import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();//this is the date
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");//this is the format
        // System.out.println(df);
        String myDate = dt.format(df);//creating datte string using date and formatter 
        System.out.println(myDate);
    }
    
}
