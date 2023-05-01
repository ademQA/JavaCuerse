package day19_staticKeyWords_passByValue_TR;

public class C01_static {
    static String staticV = "Java Candir";
    String instanceV = "Selenium heyecandir";
    public static void main(String[] args) {
        staticV="Java Hayattir";
        staticMethod();
        // System.out.println(instanceV);
    }
    public static void staticMethod(){
        System.out.println("Static method calisti");
        System.out.println(staticV);
        //System.out.println(instanceV);
    }
    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
        System.out.println(staticV);
        staticMethod();
        System.out.println(instanceV);
    }
}