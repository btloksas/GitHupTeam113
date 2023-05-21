package day08_nestedIfElse_ternary;

public class C08_Ternary {
    public static void main(String[] args) {

        char harf= 'K';
        System.out.println(harf>= 'a' && harf<= 'z'
                ? Character.toUpperCase(harf)
                :harf );
    }
}
