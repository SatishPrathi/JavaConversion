public class StringToInteger{
    public static void main(String[] args) {
        String numString = "789";

        Integer num = Integer.valueOf(numString);

        System.out.println("Original String: " + numString);
        System.out.println("Converted to Integer: " + num);

        Integer result = num + 100;
        System.out.println("Result of a simple operation: " + result);
    }
}
