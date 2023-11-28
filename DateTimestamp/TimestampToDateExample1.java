import java.util.Date;
import java.sql.Timestamp;

public class TimestampToDateExample1 {
    public static void main(String[] args) {
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        Date date = new Date(currentTimestamp.getTime());

        System.out.println("Timestamp: " + currentTimestamp);
        System.out.println("Date: " + date);
    }
}
