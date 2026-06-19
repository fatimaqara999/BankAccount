public class EdedinXususiyyetleri {
    public static void main(String[] args) {
        // ===== n = 84 =====
        int n = 84;

        boolean cut = (n % 2 == 0);
        boolean musbet = (n > 0);
        boolean uceBolunur = (n % 3 == 0);
        boolean yeddiyeBolunur = (n % 7 == 0);
        boolean hemUcHemYeddi = (n % 3 == 0) && (n % 7 == 0);
        boolean araliqda = (n > 10) && (n < 100);

        System.out.println("=== n = " + n + " ===");
        System.out.println("Cüt mi?              " + cut);
        System.out.println("Müsbət mi?           " + musbet);
        System.out.println("3-ə bölünür?         " + uceBolunur);
        System.out.println("7-yə bölünür?        " + yeddiyeBolunur);
        System.out.println("Həm 3, həm 7?        " + hemUcHemYeddi);
        System.out.println("10<n<100?            " + araliqda);

        // ===== n = 105 =====
        int n2 = 105;

        boolean cut2 = (n2 % 2 == 0);
        boolean musbet2 = (n2 > 0);
        boolean uceBolunur2 = (n2 % 3 == 0);
        boolean yeddiyeBolunur2 = (n2 % 7 == 0);
        boolean hemUcHemYeddi2 = (n2 % 3 == 0) && (n2 % 7 == 0);
        boolean araliqda2 = (n2 > 10) && (n2 < 100);

        System.out.println("\n=== n = " + n2 + " ===");
        System.out.println("Cüt mi?              " + cut2);
        System.out.println("Müsbət mi?           " + musbet2);
        System.out.println("3-ə bölünür?         " + uceBolunur2);
        System.out.println("7-yə bölünür?        " + yeddiyeBolunur2);
        System.out.println("Həm 3, həm 7?        " + hemUcHemYeddi2);
        System.out.println("10<n<100?            " + araliqda2);
    }
}