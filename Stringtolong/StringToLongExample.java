public class StringToLongExample {
    public static void main(String[] args) {
        String strNumber = "12345";
        
        long longNumber = Long.parseLong(strNumber);
        
        System.out.println("Original String: " + strNumber);
        System.out.println("Converted Long: " + longNumber);
    }
}
