package xary;

 class Recursia {
    public static void main(String[] args) {
String s = null;
        System.out.println(s.toUpperCase());

    }
    public static void recur(int a) {
        if (a <= 100) {
            System.out.println("a=" + a);
            recur(++a);
            System.out.println("a=" + a);
        }
    }
    public class In{
        public  void recur(int a) {
//            if (a <= 100) {
//                System.out.println("a=" + a);
//                recur(++a);
//                System.out.println("a=" + a);
//            }
        }
    }
} 