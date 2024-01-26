import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("0. Çıkış");

            int secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Hesap makinesi kapatılıyor...");
                break;
            }

            System.out.print("Birinci sayıyı girin: ");
            double sayi1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            switch (secim) {
                case 1:
                    sonucGoster(sayi1 + sayi2);
                    break;
                case 2:
                    sonucGoster(sayi1 - sayi2);
                    break;
                case 3:
                    sonucGoster(sayi1 * sayi2);
                    break;
                case 4:
                    if (sayi2 != 0) {
                        sonucGoster(sayi1 / sayi2);
                    } else {
                        hataGoster("Bir sayıyı sıfıra bölemezsiniz.");
                    }
                    break;
                default:
                    hataGoster("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }

        scanner.close();
    }

    public static void sonucGoster(double sonuc) {
        System.out.println("Sonuç: " + sonuc);
    }

    public static void hataGoster(String hataMesaji) {
        System.out.println("Hata: " + hataMesaji);
    }
}
