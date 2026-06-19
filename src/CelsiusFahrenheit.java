public class CelsiusFahrenheit {
    public static void main(String[] args) {
        int c1 = 0, c2 = 100, c3 = 37;

        // ===== SƏHV VARİANT: int bölmə (9/5 = 1) =====
        double sehv1 = c1 * 9 / 5 + 32;   // 0°C
        double sehv2 = c2 * 9 / 5 + 32;   // 100°C
        double sehv3 = c3 * 9 / 5 + 32;   // 37°C  ← burada xəta görünür!

        System.out.println("=== SƏHV (int bölmə: 9/5=1) ===");
        System.out.println("0°C   = " + sehv1 + " F");
        System.out.println("100°C = " + sehv2 + " F");
        System.out.println("37°C  = " + sehv3 + " F");   // 98.0 — YANLIŞ!

        // ===== DÜZGÜN VARİANT: double bölmə (9.0/5 = 1.8) =====
        double duzgun1 = c1 * 9.0 / 5 + 32;   // 0°C
        double duzgun2 = c2 * 9.0 / 5 + 32;   // 100°C
        double duzgun3 = c3 * 9.0 / 5 + 32;   // 37°C

        System.out.println("\n=== DÜZGÜN (double bölmə: 9.0/5=1.8) ===");
        System.out.println("0°C   = " + duzgun1 + " F");
        System.out.println("100°C = " + duzgun2 + " F");
        System.out.println("37°C  = " + duzgun3 + " F");   // 98.6 — DÜZGÜN!


        // 9/5   → int bölmə → 1   (kəsr atılır)
        // 9.0/5 → double bölmə → 1.8 (düzgün)
        // 37°C-də: səhv = 98.0, düzgün = 98.6 — fərq burada aydın görünür!
        // 0 və 100-də təsadüfən eyni çıxır, çünki bölmə tam gedir.
    }
}
