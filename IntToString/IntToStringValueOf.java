public class IntToStringValueOf{
    public static void main(String[] args) {
        int number = 42;
        String str = String.valueOf(number);
        
        System.out.println("Method 2: Using String.valueOf()");
        System.out.println("Original int value: " + number);
        System.out.println("String representation: " + str);
    }
}
