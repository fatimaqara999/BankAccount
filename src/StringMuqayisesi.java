public class StringMuqayisesi {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2));            // true  — məzmun eyni
        System.out.println(s1.equals(s3));            // false — "test" ≠ "TEST"
        System.out.println(s1.equalsIgnoreCase(s3));  // true  — hərf fərqi gözardı edilir
        System.out.println(s1.equals("  test  ".trim())); // true — trim boşluqları silir

        // Bonus: == ilə müqayisə
        String s4 = new String("test");
        System.out.println(s1 == s2);   // true  — hər ikisi eyni "havuz" obyektidir
        System.out.println(s1 == s4);   // false — new String() YENİ obyekt yaradır!

        // ŞƏRH: == obyektlərin EYNİ olub-olmadığını yoxlayır (yaddaş ünvanı).
        // .equals() isə MƏZMUNU (hərfləri) müqayisə edir.
        // s1==s2 → true: literal "test"-lər Java tərəfindən təkrar istifadə olunur (eyni obyekt).
        // s1==s4 → false: new String() məcburi YENİ obyekt yaradır, ünvan fərqlidir.
        // Ona görə String-i HƏMİŞƏ .equals() ilə müqayisə et, == ilə YOX!
    }
}