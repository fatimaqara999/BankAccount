public class AdSoyadAnalizi {
    public static void main(String[] args) {
        String tamAd = "leyla hüseynova";

        // 1. Ümumi uzunluq
        System.out.println("Uzunluq:          " + tamAd.length());

        // 2. İlk 5 hərf (substring: 0-dan 5-ə qədər, 5 daxil deyil)
        System.out.println("İlk 5 hərf:       " + tamAd.substring(0, 5));

        // 3. Boşluq varmı?
        System.out.println("Boşluq varmı?     " + tamAd.contains(" "));

        // 4. "leyla" ilə başlayır?
        System.out.println("\"leyla\" başlayır? " + tamAd.startsWith("leyla"));

        // 5. Böyük hərflə tam ad
        System.out.println("Böyük hərflə:     " + tamAd.toUpperCase());

        // 6. Yalnız İLK hərf böyük (ipucudakı düstur) → "Leyla hüseynova"
        String ilkHerfBoyuk = tamAd.substring(0, 1).toUpperCase() + tamAd.substring(1);
        System.out.println("İlk hərf böyük:   " + ilkHerfBoyuk);

        // 7. HƏR sözün baş hərfi böyük → "Leyla Hüseynova"
        String herSozBoyuk =
                tamAd.substring(0, 1).toUpperCase()   // "L"
                        + tamAd.substring(1, 6)                 // "eyla " (1-dən 5-ə)
                        + tamAd.substring(6, 7).toUpperCase()   // "H"
                        + tamAd.substring(7);                   // "üseynova"
        System.out.println("Hər söz böyük:    " + herSozBoyuk);
    }
}