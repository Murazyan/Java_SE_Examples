package execptions;

import java.io.FileInputStream;

public class Test {
    private static  class AClas{

    }
    public static void main(String[] args) {



        int myInt = 0;
        float myFloat = 0;
        try { 
            float result = myFloat / myFloat;
            System.out.println(result);
        } catch (RuntimeException re) { 
            System.out.println("Exception 1"); 
        } 
 
        try { 
            float result = myFloat / myInt;
            System.out.println(result);

        } catch (RuntimeException re) { 
            System.out.println("Exception 2"); 
        } 
 
        try { 
            float result = myInt / myFloat;
            System.out.println(result);

        } catch (RuntimeException re) { 
            System.out.println("Exception 3"); 
        } 
 
        try { 
            float result = myInt / myInt;
            System.out.println(result);

        } catch (RuntimeException re) { 
            System.out.println("Exception 4"); 
        } 
    } 
} 