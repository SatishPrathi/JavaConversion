public class FloatToStringExample3 {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        String stringValue = String.format("%.2f", floatValue);
        System.out.println("Converted String: " + stringValue);
    }
}
