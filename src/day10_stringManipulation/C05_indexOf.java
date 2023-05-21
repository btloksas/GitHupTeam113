package day10_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java cok ama cok güzel";

        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("cok"));

        System.out.println(str.indexOf("cok", 6));
        System.out.println(str.indexOf("cok", 5));

        System.out.println(str.indexOf("java"));

        String cumle = "Yasasın java, iyi ki java ogreniyorum";

        String kelime = "java";

        int kelimeKullanimSayisi = 0;


        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("aradiginiz kelime cumlede hic kullanılmamıs");
        } else {
            int kelimeIlkIndex = cumle.indexOf(kelime);
            if (cumle.indexOf(kelime, (kelimeIlkIndex + 1)) == (-1)) {
                System.out.println("aradıgınız kelime cumlede bir kere kullanilmis");

            } else {
                int ikinciKelimeIndex = cumle.indexOf(kelime, (kelimeKullanimSayisi + 1));
                if (cumle.indexOf(kelime, (ikinciKelimeIndex+1)) == (-1)) {
                    System.out.println("aradıgınız kelime cumlede 2 kere kullanilmis");
                }else {
                    System.out.println("aradıgınız kelime cumlede 2 kere kullanilmis");
                }

            }


        }
    }
}
