public class IntToCharExample3 {
    public static void main(String[] args) {
        int intValue = 67; 
        String stringValue = String.valueOf(intValue);
        char charValue = stringValue.charAt(0);
        
        System.out.println("int value: " + intValue);
        System.out.println("char value: " + charValue);
    }
}
