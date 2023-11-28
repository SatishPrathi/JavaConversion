public class FloatToStringExample4 {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(floatValue);
        String stringValue = stringBuilder.toString();
        System.out.println("Converted String: " + stringValue);
    }
}
