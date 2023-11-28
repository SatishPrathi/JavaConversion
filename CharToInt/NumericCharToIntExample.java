public class NumericCharToIntExample {
    public static void main(String[] args) {
        char numericChar = '5';
        int numericValue = charToNumericValue(numericChar);
        System.out.println("Numeric value of " + numericChar + " is: " + numericValue);
    }

    private static int charToNumericValue(char c) {
        return Character.getNumericValue(c);
    }
}
