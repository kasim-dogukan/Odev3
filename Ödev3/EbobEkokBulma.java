import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobBul(sayi1, sayi2);
        int ekok = ekokBul(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }

    // EBOB bulma metodu
    public static int ebobBul(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int gecici = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = gecici;
        }
        return sayi1;
    }

    // EKOK bulma metodu
    public static int ekokBul(int sayi1, int sayi2) {
        return (sayi1 * sayi2) / ebobBul(sayi1, sayi2);
    }
}
