public class HexToDecimalExample3 {
    public static void main(String args[]) {
        int a = Integer.parseInt("a", 16);
        int f = Integer.parseInt("f", 16);
        int number121 = Integer.parseInt("121", 16);

        int sum = a + f;
        int product = a * number121;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
