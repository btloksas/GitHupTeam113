package day06_bagımsızIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);


        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();
        if (not >= 50&& not<=100) {
            System.out.println("Sinifi gectin");
        }


      else {
            System.out.println("Malesef kaldin");
        }

        System.out.println("pozitif bir tam sayi giriniz");
      int sayi= scan.nextInt();
      if ((sayi&2)==0){
          System.out.println("Girilen sayi cift sayi");
      }
      else {
          System.out.println("Girilen sayi tek");
      }

      if (sayi%5==0){
          System.out.println("sayi 5 ile tam olarak bolunebilir");
      }
      else {
          System.out.println("sayi 5 ile tam olarak bolunemez");
      }
    }
}
