import java.util.Scanner;

public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        int aKisakenar,bUzunkenar;
        double cHipotenus;
        double yukseklik;
        double alan;

        Scanner oku = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        aKisakenar = oku.nextInt();
        System.out.println("2. kenarı giriniz: ");

        bUzunkenar = oku.nextInt();
        cHipotenus = Math.sqrt(((aKisakenar*aKisakenar) + (bUzunkenar*bUzunkenar)));
        yukseklik = (aKisakenar + bUzunkenar + cHipotenus) / 2;
        alan = (bUzunkenar*yukseklik)/2;

        System.out.println("Hipotenüs :" + cHipotenus);
        System.out.println("Yükseklik :" + yukseklik);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
