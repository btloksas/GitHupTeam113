package day07_genelTekrar_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliyorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati"

        // ikisine de bolunemiyorsa "ne 3'un ne de 5'in kati" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi = scan.nextInt();


        if(sayi%3==0 && sayi%5==0){

            System.out.println("3 ve 5'in kati");
        }

       else if(sayi%3==0){
            System.out.println("3'un kati");
        }
       else if (sayi%5==0){
            System.out.println("5'in kati");
        }





    }
}
