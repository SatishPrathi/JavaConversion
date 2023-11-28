import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {

    public static void main(String[] args) {
        String dateString = "2023-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = sdf.parse(dateString);
            System.out.println("Converted Date: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date currentDate = new Date();
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
