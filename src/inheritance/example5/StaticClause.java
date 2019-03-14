package inheritance.example5;

class A {

    A(int val) {
        System.out.println("A(" + val + ")");
    }

    void func(int val) {

        System.out.println("func(" + val + ")");
    }
}

class B {
    static A a1;
    static A a2;

    static {
        a1 = new A(1);
        a2 = new A(2);
    }

    B() {
        System.out.println("B()");
    }
}

public class StaticClause {

    public static void main(String[] args) {

        System.out.println("Inside main()");

        B.a1.func(99); // (1)
    }
    //uncoment the following code and see what happens
    // static B x = new B(); // (2)
    // static B y = new B(); // (2)
}