public class StringToCharExample2 {
    public static void main(String[] args) {
        String str = "World";
        
        char[] charArray = str.toCharArray();
        
        char firstChar = charArray[0];
        
        System.out.println("Original String: " + str);
        System.out.println("Converted char: " + firstChar);
    }
}
