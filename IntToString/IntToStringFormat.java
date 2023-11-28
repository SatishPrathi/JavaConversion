public class IntToStringFormat {
    public static void main(String[] args) {
        int number = 42;
        String str = String.format("%d", number);
        
        System.out.println("Method 3: Using String.format()");
        System.out.println("Original int value: " + number);
        System.out.println("String representation: " + str);
    }
}
