public class KreditUygunlugu {
    public static void main(String[] args) {
        // ===== Müştəri 1 =====
        int yas1 = 34;
        double gelir1 = 1500;
        double meblev1 = 10000;
        boolean tarix1 = true;

        boolean uygun1 = (yas1 >= 21 && yas1 <= 65)
                && (gelir1 > 800)
                && (meblev1 >= 300 && meblev1 <= 50000)
                && (tarix1);

        System.out.println("Müştəri 1 uyğundur: " + uygun1);   // true

        // ===== Müştəri 2 =====
        int yas2 = 19;
        double gelir2 = 950;
        double meblev2 = 3000;
        boolean tarix2 = true;

        boolean uygun2 = (yas2 >= 21 && yas2 <= 65)
                && (gelir2 > 800)
                && (meblev2 >= 300 && meblev2 <= 50000)
                && (tarix2);

        System.out.println("Müştəri 2 uyğundur: " + uygun2);   // false

        // ===== Müştəri 3 =====
        int yas3 = 45;
        double gelir3 = 750;
        double meblev3 = 7000;
        boolean tarix3 = false;

        boolean uygun3 = (yas3 >= 21 && yas3 <= 65)
                && (gelir3 > 800)
                && (meblev3 >= 300 && meblev3 <= 50000)
                && (tarix3);

        System.out.println("Müştəri 3 uyğundur: " + uygun3);   // false
    }
}
