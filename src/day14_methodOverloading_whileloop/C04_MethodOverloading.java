package day14_methodOverloading_whileloop;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        topla(3,5);
        topla(3.4,2.3);

        topla('a', 'b');
        topla(3f, 4f);

    }

    public static void topla(int a, int b){
        System.out.println("iki tamsayinin toplami"+ (a+b));
    }
    public static void topla(double a,double b){
        System.out.println("Iki double sayinin toplami:"+ (a+b));
    }
    public static void topla(int sayi1, double sayi2){

        System.out.println("int ve double sayilarin :"+ (sayi1+sayi2));
    }
    public static void topla (double sayi1, int sayi2){
        System.out.println("double ve int sayilarin toplami: "+ (sayi1+ sayi2 ));


    }
}
