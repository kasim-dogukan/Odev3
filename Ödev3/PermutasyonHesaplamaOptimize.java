import java.util.Arrays;

public class PermutasyonHesaplamaOptimize {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3};
        int n = dizi.length;

        System.out.println(Arrays.toString(dizi) + " dizisinin permutasyonları:");
        permutasyonHesapla(dizi, 0, n - 1);
    }

    public static void permutasyonHesapla(int[] dizi, int baslangic, int bitis) {
        if (baslangic == bitis) {
            System.out.println(Arrays.toString(dizi));
        } else {
            for (int i = baslangic; i <= bitis; i++) {
                swap(dizi, baslangic, i);
                permutasyonHesapla(dizi, baslangic + 1, bitis);
                swap(dizi, baslangic, i); // Geri al
            }
        }
    }

    public static void swap(int[] dizi, int i, int j) {
        int gecici = dizi[i];
        dizi[i] = dizi[j];
        dizi[j] = gecici;
    }
}
