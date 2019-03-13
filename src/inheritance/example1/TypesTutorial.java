//package inheritance.example1;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class TypesTutorial {
//
//    public static final void main(String... atgs) {
//        A alpha = new B();
//    }
//}
//
//class A {
//    A(){
//        System.out.print("A");
//        a();
//    }
//
//    void a() throws IOException {
//        System.out.print("a");
//    }
//}
//
//class B extends A {
//    B() {
//        System.out.print("B");
//        a();
//    }
//
//    void a() throws FileNotFoundException {
//        System.out.print("b");
//    }
//}