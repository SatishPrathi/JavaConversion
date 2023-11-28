public class LongToStringExample4 {
    public static void main(String[] args) {
        long number = 123456789L;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        String str4 = stringBuilder.toString();

        System.out.println("Method 4: Using StringBuilder");
        System.out.println("Original long: " + number);
        System.out.println("Converted String: " + str4);
    }
}
