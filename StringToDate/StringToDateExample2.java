import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample2 {

    public static void main(String[] args) throws Exception {
        String sDate1 = "27/11/2023";
        String sDate2 = "27-Nov-2023";
        String sDate3 = "11 27, 2023";
        String sDate4 = "Mon, Nov 27 2023";
        String sDate5 = "Mon, Nov 27 2023 12:30:45";
        String sDate6 = "27-Nov-2023 12:30:45";

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

        Date date1 = formatter1.parse(sDate1);
        Date date2 = formatter2.parse(sDate2);
        Date date3 = formatter3.parse(sDate3);
        Date date4 = formatter4.parse(sDate4);
        Date date5 = formatter5.parse(sDate5);
        Date date6 = formatter6.parse(sDate6);

        System.out.println(sDate1 + "\t" + date1);
        System.out.println(sDate2 + "\t" + date2);
        System.out.println(sDate3 + "\t" + date3);
        System.out.println(sDate4 + "\t" + date4);
        System.out.println(sDate5 + "\t" + date5);
        System.out.println(sDate6 + "\t" + date6);
    }
}
