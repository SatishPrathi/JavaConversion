public class StringToBoolean1 {
    public static void main(String[] args) {
        String strTrue = "true";
        String strFalse = "false";
        String strRandom = "random";

        boolean boolTrue = Boolean.parseBoolean(strTrue);
        boolean boolFalse = Boolean.parseBoolean(strFalse);
        boolean boolRandom = Boolean.parseBoolean(strRandom);

        System.out.println("boolTrue: " + boolTrue);     
        System.out.println("boolFalse: " + boolFalse);   
        System.out.println("boolRandom: " + boolRandom); 
    }
}
