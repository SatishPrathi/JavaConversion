public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        String binaryString = "101010";

        int decimalNumber = Integer.parseInt(binaryString, 2);

        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalNumber);
    }
}
