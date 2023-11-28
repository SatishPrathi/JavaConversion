public class LongToStringExample3 {
    public static void main(String[] args) {
        long number = 555555555L;
        
        String str3 = String.format("%d", number);
        
        System.out.println("Method 3: Using String.format()");
        System.out.println("Original long: " + number);
        System.out.println("Converted String: " + str3);
    }
}
