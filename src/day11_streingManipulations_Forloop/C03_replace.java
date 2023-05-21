package day11_streingManipulations_Forloop;

public class C03_replace {
    public static void main(String[] args) {
        String str ="Java Candir";

        System.out.println(str.replace('C', 'H'));

        System.out.println(str.replace("a", ""));

        System.out.println(str.replace("Java", "X"));

        System.out.println(str.replace("v", "yayaya"));

        System.out.println(str.replace("va", "lala"));


        System.out.println(str = str.replace(" ", ""));

        System.out.println(str.replaceFirst("a", ""));

        System.out.println(str.replaceFirst("C", "K"));
    }
}
