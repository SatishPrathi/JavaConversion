public class StringToFloatExample {
    public static void main(String[] args) {
        String strNumber = 3.14;
        float floatValue = Float.parseFloat(strNumber);
        System.out.println(Parsed Float Value  + floatValue);

        String anotherNumber = 42.75;
        float anotherFloatValue = Float.parseFloat(anotherNumber);
        System.out.println(Parsed Another Float Value  + anotherFloatValue);
    }
}
