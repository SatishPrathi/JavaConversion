public class StringToDoubleExample2 {
    public static void main(String[] args) {
        String str = "567.89";
        Double result = Double.valueOf(str);
        System.out.println("Parsed double value: " + result.doubleValue());
    }
}
