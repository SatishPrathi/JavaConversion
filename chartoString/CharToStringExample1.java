public class CharToStringExample1 {
    public static void main(String[] args) {
        char myChar = 'A';
        String myString = new String(new char[]{myChar});
        System.out.println("Converted String: " + myString);
    }
}
