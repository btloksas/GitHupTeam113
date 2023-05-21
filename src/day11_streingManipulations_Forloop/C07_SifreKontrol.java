package day11_streingManipulations_Forloop;

public class C07_SifreKontrol {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        // soruyu if else ile yaparsak sadece 1 hata yazdirir, otekilere bakmaz
        // bagimsiz 4 if-else cumlesi olmali
        // en sonda 4 sarti'da sagladigini kontrol eden bir variable kullanacagiz


        int flag = 0;
        String sifre = "trdy 895649456";

        if (sifre.charAt(0) > 'a' && sifre.charAt(0) <= 'z') {
            flag++;
        } else {
            System.out.println("ilk karakter kücük harf olmali");
            char sonHarf=sifre.charAt(sifre.length()-1);
            if (sonHarf>='0' && sonHarf<='9'){
                flag++;
            }else{
                System.out.println("son karakter rakam olmali");
            }
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
        } else {
            flag++;
        }

        if (sifre.length()>=10){
            flag++;
        }else{
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");

            if(flag==4){
                System.out.println("sifre basariyla kaydedildi");
            }
        }
    }
}
