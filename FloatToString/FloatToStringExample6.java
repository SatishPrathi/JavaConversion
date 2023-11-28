import java.text.DecimalFormat;

public class FloatToStringExample6 {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String stringValue = decimalFormat.format(floatValue);
        System.out.println("Converted String: " + stringValue);
    }
}
