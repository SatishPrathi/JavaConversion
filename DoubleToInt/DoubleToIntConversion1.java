public class DoubleToIntConversion1 {
    public static void main(String[] args) {
        double doubleValue = 10.75;
        
        int intValue2 = (int) Math.floor(doubleValue);
        System.out.println("Method 2: Using Math.floor - Result: " + intValue2);
        
        int intValue3 = (int) Math.ceil(doubleValue);
        System.out.println("Method 3: Using Math.ceil - Result: " + intValue3);
    }
}
