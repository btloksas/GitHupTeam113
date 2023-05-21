package day14_methodOverloading_whileloop;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;


        while (flag != 4) {
            flag=0;
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;
            }else{
                System.out.println("İlk karakter kucuk olmali");
            }

            if(sifre.charAt(sifre.length()-1)>='A'&& sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            }else{
                System.out.println("Son karakter buyuk olmali");
            }
            if(sifre.contains(" ")){
                System.out.println("Sifre bosluk içermemeli");
            }else{
                flag++;
            }
            if(sifre.length()>=8){
                flag++;
            }else{
                System.out.println("Uzunluk en az 8 karakter olmali");
            }
            denemeSayisi++;
        }
        System.out.println("Tebrikler"+ ".  " +
                "" +
                "" +
                "deneme sifreniz basari ile kaydedildi");
    }
}