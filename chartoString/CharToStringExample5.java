public class CharToStringExample5 {
    public static void main(String[] args) {
        char myChar = 'E';
        String myString = "".concat(String.valueOf(myChar));
        System.out.println("Converted String: " + myString);
    }
}
