public class IntToLongExample {
    public static void main(String[] args) {
        int intValue1 = 42;
        long longValue1 = (long) intValue1;
        System.out.println("Method 1: Explicit Casting - Result: " + longValue1);

        int intValue2 = 123456789;
        long longValue2 = intValue2;
        System.out.println("Method 2: Direct Assignment - Result: " + longValue2);
    }
}
