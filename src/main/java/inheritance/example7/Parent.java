package inheritance.example7;

public class Parent {
    int i =1;
    public void method(){
        System.out.println("from class parent");
    }

    public Parent(int a){
        System.out.println("paren 1 argument");
    }

    public Parent(){
        System.out.println("parent No Args");

    }
}


class Child extends  Parent{
    int i = 2;
    public void method(){
        System.out.println("from class child");
    }

    public Child(int i){
        this.i=i;
        System.out.println("child one args");
    }
}


class Demo{
    public static void main(String[] args) {
        Parent obj =new Child(5);
        System.out.println(obj.i);
        obj.method();
    }
}

class Test {

    // i could be assigned a value here
    // or constructor or init block also.
    final  int i;
    Test()
    {
        i = 10;
    }

    // other stuff in the class
}
