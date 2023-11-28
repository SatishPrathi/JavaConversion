public class StringToLongWithValueOf {
    public static void main(String[] args) {
        String strNumber = "98765";
        
        Long longObj = Long.valueOf(strNumber);
        long longNumber = longObj.longValue();
        
        System.out.println("Original String: " + strNumber);
        System.out.println("Converted Long: " + longNumber);
    }
}
