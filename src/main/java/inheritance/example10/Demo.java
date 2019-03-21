package inheritance.example10;

public class Demo{

    {
        System.out.print("8");
    }
    public static void main(String[] args) {
//        new B();
//        new Demo();
        int b =7;
        int c = -4;
        int a= b%c;
        System.out.println(a);

    }
    static {
        System.out.print("7");
    }
}