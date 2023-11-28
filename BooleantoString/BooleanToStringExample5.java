public class BooleanToStringExample5 {
    public static void main(String[] args) {
        boolean myBoolean = true;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myBoolean);
        String booleanString = stringBuilder.toString();
        System.out.println("Converted String using StringBuilder: " + booleanString);
    }
}
