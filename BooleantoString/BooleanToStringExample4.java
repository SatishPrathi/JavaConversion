public class BooleanToStringExample4 {
    public static void main(String[] args) {
        boolean myBoolean = false;
        String booleanString = String.format("%b", myBoolean);
        System.out.println("Converted String using String.format(): " + booleanString);
    }
}
