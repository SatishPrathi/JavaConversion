public class CharToIntExample {
    public static void main(String[] args) {
        char myChar = 'A';
        int asciiValue = charToInt(myChar);
        System.out.println("ASCII value of " + myChar + " is: " + asciiValue);
    }

    private static int charToInt(char c) {
        return (int) c;
    }
}
