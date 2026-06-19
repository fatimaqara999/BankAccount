public class KoduOxumaq {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean x = true, y = false;
        String s = "Java";

        System.out.println(a + b * 2);       // 16  (vurma əvvəl: 3*2=6, +10)
        System.out.println(a / b);           // 3   (int bölmə: kəsr atılır)
        System.out.println(a % b);           // 1   (qalıq)
        System.out.println(x && !y);         // true
        System.out.println(!x || y);         // false
        System.out.println(a > 5 && b < 5);  // true
        System.out.println(s + a);           // Java10
        System.out.println("3" + 4);         // 34  (mətn birləşmə)
        System.out.println(3 + 4 + "!");     // 7!  (əvvəl 3+4=7, sonra mətn)
        System.out.println("!" + 3 + 4);     // !34 (əvvəl "!"+3, sonra +4)
    }
}