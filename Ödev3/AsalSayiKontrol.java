import java.util.Scanner;

public class AsalSayiKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            if (asalMi(sayi)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }

        scanner.close();
    }

    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
