package day14_methodOverloading_whileloop;

public class C02_isAsal {
    public static void main(String[] args) {

        System.out.println(isAsal(20));
        System.out.println(isAsal(43));
        boolean sonuc=isAsal(57);




    }

    public static boolean isAsal(int sayi){
        int flag=0;

        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (sayi==2){
            return true;
        }

        if(flag==0){
            return true;

        }else {
            return false;

        }
    }
}


