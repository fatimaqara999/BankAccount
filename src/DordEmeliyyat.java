public class DordEmeliyyat {
    public static void main(String[] args) {
        int a = 17, b = 5;

        System.out.println("Toplama:  " + a + " + " + b + " = " + (a + b));  // 22
        System.out.println("Çıxma:    " + a + " - " + b + " = " + (a - b));  // 12
        System.out.println("Vurma:    " + a + " * " + b + " = " + (a * b));  // 85
        System.out.println("Bölmə:    " + a + " / " + b + " = " + (a / b));  // 3 (3.4 deyil!)
        System.out.println("Qalıq:    " + a + " % " + b + " = " + (a % b));  // 2


        // Qalıq: 17 = 5×3 + 2  →  ona görə 17 % 5 = 2
    }
}
