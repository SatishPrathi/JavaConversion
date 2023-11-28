public class StringToBoolean2 {
    public static void main(String[] args) {
        String strTrue = "true";
        String strFalse = "false";
        String strRandom = "random";

        Boolean boolTrue = Boolean.valueOf(strTrue);
        Boolean boolFalse = Boolean.valueOf(strFalse);
        Boolean boolRandom = Boolean.valueOf(strRandom);

        System.out.println("boolTrue: " + boolTrue);       
        System.out.println("boolFalse: " + boolFalse);     
        System.out.println("boolRandom: " + boolRandom);  
    }
}
