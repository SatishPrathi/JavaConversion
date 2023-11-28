import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDateExample {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        Date date = timestamp.toDate();

        System.out.println("Original Timestamp: " + timestamp);
        System.out.println("Converted Date: " + date);
    }
}
