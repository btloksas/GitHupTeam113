package day03_scanner_dataCasting;

public class C06_ExplicitNarroving {

    public static void main(String[] args) {

        double db1= 45.32;

        int in1=(int) db1;
        System.out.println(in1);

        db1 =3987876765d;

        in1= (int) db1;

        System.out.println(in1);

        in1=34;

        byte by1=(byte) in1;

        System.out.println(by1);

        in1=130;

        by1=(byte)in1;
        System.out.println(by1);





    }
}
