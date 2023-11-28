public class StringToCharExample3 {
    public static void main(String[] args) {
        String str = "Java";
        
        Character charObject = Character.valueOf(str.charAt(0));
        
        char firstChar = charObject.charValue();
        
        System.out.println("Original String: " + str);
        System.out.println("Converted char: " + firstChar);
    }
}
