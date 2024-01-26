public class PalindromKontrolOptimize {
    public static void main(String[] args) {
        String kelime1 = "radar";
        String kelime2 = "java";

        if (isPalindrom(kelime1)) {
            System.out.println(kelime1 + " bir palindrom kelime.");
        } else {
            System.out.println(kelime1 + " bir palindrom kelime değil.");
        }

        if (isPalindrom(kelime2)) {
            System.out.println(kelime2 + " bir palindrom kelime.");
        } else {
            System.out.println(kelime2 + " bir palindrom kelime değil.");
        }
    }

    public static boolean isPalindrom(String kelime) {
        kelime = kelime.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return kelime.equals(new StringBuilder(kelime).reverse().toString());
    }
}
