package day26_inheritanceDataTypeUsing;

public class C03_OverridingB extends C03_OverridingA{
    void method1(){
        System.out.println("Overriding2 method1");
    }
    String method2(){
        System.out.println("Overriding2 method2");
        return "Java";
    }
    void method3(){
        System.out.println("Overriding2 method3");
    }
}
