public class DecimalToBinaryExample3 {
    public static void main(String args[]) {
        int decimalNumber = 42;
        String binaryString = convertToBinary(decimalNumber);

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryString);
    }

    static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        System.out.println("Decimal: " + decimal);
        System.out.print("Binary: ");

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); 
            System.out.print(remainder); 
            decimal = decimal / 2;
        }

        if (binary.length() == 0) {
            binary.append("0");
        }

        System.out.println(); 
        return binary.toString();
    }
}
