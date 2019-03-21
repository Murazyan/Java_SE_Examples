package inheritance.example9;

public class Main {
  public static void main(String args[]) { 
     ClassA a = new ClassA(); 
     a.methodA(); 
  }  
} 
 
class ClassA { 
    public void methodA(){ 
        ClassB classB = new ClassB(); 
        System.out.println(classB.getValue()); 
    } 
} 
   
class ClassB { 
    public ClassC classC;
    public String getValue() { 
        return classC.getValue(); 
    } 
} 
   
class ClassC { 
    public String value; 
    public String getValue() { 
        value = "ClassC"; 
        return value; 
    } 
} 