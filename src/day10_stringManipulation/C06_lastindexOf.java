package day10_stringManipulation;

public class C06_lastindexOf {

    public static void main(String[] args) {
        String str="Java bazen beyin yakar";

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("a", 2));

        System.out.println(str.lastIndexOf("a", 19));
        System.out.println(str.indexOf("a", 4));
        System.out.println(str.lastIndexOf("a", 17));
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf("Mustafa"));



        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis
        String cumle= "Yasasin java, iyi ki java ogreniyorum";
        String kelime= "Yasasin";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }
    }
}



