public class StringToInt{
    public static void main(String[] args) {
        String numString = "456";

        int num = Integer.parseInt(numString);

        System.out.println("Original String: " + numString);
        System.out.println("Converted to int: " + num);
        
        int result = num * 2;
        System.out.println("Result of a simple operation: " + result);
    }
}
