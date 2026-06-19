public class XetaliKod {
    public static void main(String[] args) {
        int yas = 25;                    // Xəta 1: "Int" yox "int" — Java case-sensitive-dir
        String sehir = "baku";           // Xəta 2: String dəyəri dırnaq içində olmalıdır
        double kreditMeblegi = 5000;     // Xəta 3: dəyişən adında boşluq olmaz
        boolean aktiv = true;            // Xəta 4: boolean kiçik hərflə: true/false
        final int LIMIT = 100;
        // LIMIT = 200;                  // Xəta 5: final dəyişəni dəyişmək olmur
        System.out.println(yas);         // Xəta 6: sətir ";" ilə bitir, "." ilə yox
    }
}
