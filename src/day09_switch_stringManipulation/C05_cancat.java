package day09_switch_stringManipulation;

public class C05_cancat {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Candir";
        String str3= "  ";
        System.out.println(str1 + str2 + str3);
        System.out.println(str1.concat(str3).concat(str2));
    }
}
