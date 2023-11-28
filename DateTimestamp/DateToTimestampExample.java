import java.util.Date;
import java.sql.Timestamp;

public class DateToTimestampExample {
    public static void main(String[] args) {
        Date currentDate = new Date();

        Timestamp timestamp = new Timestamp(currentDate.getTime());

        System.out.println("Date: " + currentDate);
        System.out.println("Timestamp: " + timestamp);
    }
}
