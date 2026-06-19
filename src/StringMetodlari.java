public class StringMetodlari {
    public static void main(String[] args) {
        String metn = " Salam, ABB Bank! ";

        System.out.println("Uzunluq (trim-siz):   " + metn.length());
        System.out.println("Uzunluq (trim ilə):   " + metn.trim().length());
        System.out.println("Böyük hərflə:         " + metn.toUpperCase());
        System.out.println("Kiçik hərflə:         " + metn.toLowerCase());
        System.out.println("\"ABB\" var mi?         " + metn.contains("ABB"));
        System.out.println("\"bank\" var mi?        " + metn.contains("bank"));
        System.out.println("Bank → Kredit:        " + metn.replace("Bank", "Kredit"));
        System.out.println("\"Salam\" ilə başlayır? " + metn.trim().startsWith("Salam"));
    }
}