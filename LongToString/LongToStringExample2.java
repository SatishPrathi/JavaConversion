public class LongToStringExample2 {
    public static void main(String[] args) {
        long number = 987654321L;
        
        String str2 = Long.toString(number);
        
        System.out.println("Method 2: Using Long.toString()");
        System.out.println("Original long: " + number);
        System.out.println("Converted String: " + str2);
    }
}
