public class MuqayiseNeticeleri {
    public static void main(String[] args) {
        int x = 18, y = 18, z = 25;

        System.out.println("x == y → " + (x == y));   // true
        System.out.println("x != y → " + (x != y));   // false
        System.out.println("x == z → " + (x == z));   // false
        System.out.println("x != z → " + (x != z));   // true
        System.out.println("x < z  → " + (x < z));    // true
        System.out.println("x > z  → " + (x > z));    // false
        System.out.println("z > x  → " + (z > x));    // true
        System.out.println("y != z → " + (y != z));   // true
        System.out.println("x <= y → " + (x <= y));   // true
        System.out.println("x >= y → " + (x >= y));   // true
    }
}
