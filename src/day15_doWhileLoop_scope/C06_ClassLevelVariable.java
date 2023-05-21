package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {

    static  int sayi=10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;




    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String: "+isim);
        System.out.println("boolean:"+ bl);
        System.out.println("char : " + chr); // '' hiclik
        System.out.println("int : " + in1); // sayisal turler icin 0
        // System.out.println(bl2); instance
        staticMethod();


    }

    public static void staticMethod() {
        sayi++;
        System.out.println(sayi);
        System.out.println(chr);
        //System.out.println(in2);
        //System.out.println(bl2);


    }


    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi);
        System.out.println(bl);
        System.out.println(in2);
        System.out.println(bl2);


    }
}
