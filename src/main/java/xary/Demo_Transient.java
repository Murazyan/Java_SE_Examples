package xary;

public class Demo_Transient {
    private int a =1;
    private transient String b ="string" ;

    @Override
    public String toString() {
        return "Demo_Transient{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Demo_Transient obj = new Demo_Transient();
        System.out.println(obj);
    }
}
