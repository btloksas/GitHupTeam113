package day17_arrays;

public class C03_EnUzunElementiYazdir {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


        String [] arr={"Melike","Burkay","İnci","Eda","Emre"};
        enUzunEnkisaYazdir(arr);
        String [] arr2={"Melike","Burkay","İnci","Eda","Emre","Huseyin"};
        enUzunEnkisaYazdir(arr2);

    }

    public static void enUzunEnkisaYazdir(String[]arr){
        String enUzunkelime=arr[0];
        String enKisaKelime=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>=enUzunkelime.length()){
                enUzunkelime=arr[i];
                
            }
            if (arr[i].length()<=enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }
        }
        System.out.println("Array'deki en uzun kelime:"+ enUzunkelime);
        System.out.println("Array'deki en kisa kelime:"+ enKisaKelime);
    }
}
