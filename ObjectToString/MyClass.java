public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass(42);
        String result = myObject.toString();
        System.out.println(result);
    }
}
