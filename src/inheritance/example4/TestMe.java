package inheritance.example4;

public class TestMe {
    public static Integer variable = 1; 
 
    public static void main(String[] args) { 
        System.out.println(TestMeOneMoreTime.variable);
    } 
 
} 
 
class TestMeOneMoreTime extends TestMe { 
    public static Integer variable = 2; 
}