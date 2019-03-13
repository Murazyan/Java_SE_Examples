package inheritance.exampl2;

public class Test extends A {
    public int i = 1; 
    public static void main(String... args) { 
        System.out.print(new Test().i); 
        System.out.print(new A().i); 
        System.out.print( ((A)new Test()).i ); 
    } 
} 
 
class A {
    public int i = 2;
}