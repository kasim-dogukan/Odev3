import java.util.Scanner;

public class ArmstrongSayiKontrolOptimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isArmstrong(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int sayi) {
        int originalSayi = sayi;
        int basamakSayisi = String.valueOf(sayi).length();
        int toplam = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            sayi /= 10;
        }

        return toplam == originalSayi;
    }
}
