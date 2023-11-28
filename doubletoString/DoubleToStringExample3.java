public class DoubleToStringExample3 {
    public static void main(String[] args) {
        double doubleValue = 3.14;

        String stringValue = String.format("%.2f", doubleValue);

        System.out.println("Double value: " + doubleValue);
        System.out.println("Formatted String value: " + stringValue);
    }
}
