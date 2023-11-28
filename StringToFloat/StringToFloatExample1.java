public class StringToFloatExample1 {
    public static void main(String[] args) {
        String strValue = "7.5";
        Float floatValueObj = Float.valueOf(strValue);
        System.out.println("Converted Float Value (via Float.valueOf()): " + floatValueObj);

        String negativeNumber = "-10.25";
        Float negativeFloatValueObj = Float.valueOf(negativeNumber);
        System.out.println("Converted Negative Float Value (via Float.valueOf()): " + negativeFloatValueObj);
    }
}
