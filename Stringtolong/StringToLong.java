public class StringToLong {
    public static void main(String[] args) {
        String strNumber = "abc"; 
        
        try {
            long longNumber = Long.parseLong(strNumber);
            
            System.out.println("Original String: " + strNumber);
            System.out.println("Converted Long: " + longNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
