public class RegemleriParcala {
    public static void main(String[] args) {
        // ===== 1-ci ədəd: 583 =====
        int sayi = 583;

        int yuzler = sayi / 100;          // 583 / 100 = 5
        int onlar = (sayi % 100) / 10;    // (583 % 100) / 10 = 83 / 10 = 8
        int birler = sayi % 10;           // 583 % 10 = 3
        int cem = yuzler + onlar + birler;

        System.out.println("Ədəd: " + sayi);
        System.out.println("Yüzlər: " + yuzler);
        System.out.println("Onlar:  " + onlar);
        System.out.println("Birlər: " + birler);
        System.out.println("Cəm:    " + cem);

        // ===== 2-ci ədəd: 907 (onlar rəqəmi 0) =====
        int sayi2 = 907;

        int yuzler2 = sayi2 / 100;          // 907 / 100 = 9
        int onlar2 = (sayi2 % 100) / 10;    // (907 % 100) / 10 = 7 / 10 = 0
        int birler2 = sayi2 % 10;           // 907 % 10 = 7
        int cem2 = yuzler2 + onlar2 + birler2;

        System.out.println("\nƏdəd: " + sayi2);
        System.out.println("Yüzlər: " + yuzler2);
        System.out.println("Onlar:  " + onlar2);
        System.out.println("Birlər: " + birler2);
        System.out.println("Cəm:    " + cem2);
    }
}