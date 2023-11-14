package av_hw6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Арифметические и сравнительные операторы");
        byte a = 1;
        byte b = 2;
        byte c = 3;
        byte d = 4;
        byte e = 5;

        System.out.println("а + b = " + (a + b));
        System.out.println("d - a = " + (d - a));
        System.out.println("e % c = " + (e % c));
        System.out.println("e * e = " + (e * e));
        System.out.println("d / b = " + (d * b));
        System.out.println("d / b = " + (d * b));
        System.out.println("++d = " + (++d));
        System.out.println("d++ = " + (d++));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        System.out.println("Сравнение");
        int annualturnover = 1000000;
        byte accession = 5;
        if (annualturnover <= 1000000 & accession <= 5) ;
        System.out.println("Вам присвоен статус Gold");

        if (annualturnover >= 1000000 & accession >= 5) ;
        System.out.println("Вам недоступен статус Gold");

        System.out.println("Переполнение");
        byte a1 = 127;
        short a2 = 32700;
        float a3 = 1.02f;


        System.out.println("Переполнение byte = " + (++a1));
        System.out.println("Переполнение short = " + (short) (a2 * a3));

    }
}