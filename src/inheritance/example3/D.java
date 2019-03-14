package inheritance.example3;

class A {
  protected A() {
      System.out.print("A"); }
} 
 class B { 
  public B() {
      System.out.print("B"); }
} 
 class C { 
  public C() {
      System.out.print("C"); }
} 
public class D extends C {

//  private A objA = new A();
//  private static B objB = new B();
//
//  public D() {
//      System.out.print("D"); }

    static {
        System.out.println("bo-bo");
    }
   
  public static void main(String[] args){
      System.out.println("main");
//      Integer i = new Integer("1");
//    new D();
  }
  static {
      System.out.println("s2");
      System.exit(0);
  }
}