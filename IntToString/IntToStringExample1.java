public class IntToStringExample1 {
    public static void main(String[] args) {
        int number = 42;
        String str = Integer.toString(number);
        
        System.out.println("Method 1: Using Integer.toString()");
        System.out.println("Original int value: " + number);
        System.out.println("String representation: " + str);
    }
}
