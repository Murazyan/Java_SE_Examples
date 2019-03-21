package inheritance.example10;

class A
{ 
    { 
        System.out.print("5"); 
    } 
     
    static { 
        System.out.print("3"); 
    } 
     
    public A() { 
        System.out.print("4"); 
    } 
} 
         
public class B extends A { 
    { 
        System.out.print("2"); 
    } 
     
    static { 
        System.out.print("6"); 
    } 
     
    public B() { 
        System.out.print("1"); 
    } 
     
}
