public class IntToCharExample2 {
    public static void main(String[] args) {
        int intValue = 66; 
        char[] charArray = Character.toChars(intValue);
        
        System.out.println("int value: " + intValue);
        System.out.println("char value: " + charArray[0]);
    }
}
