public class KreditHesabi {
    public static void main(String[] args) {
        double mebleg = 8000.0;       // kredit məbləği
        double faiz = 15.0;           // illik faiz (%)
        double muddet = 12;           // müddət (ay)

        // Düstur 1: ümumi faiz
        double umumiFaiz = mebleg * (faiz / 100);        // 8000 × 0.15 = 1200.0

        // Düstur 2: ümumi ödəniş
        double umumiOdenis = mebleg + umumiFaiz;         // 8000 + 1200 = 9200.0

        // Düstur 3: aylıq ödəniş
        double aylikOdenis = umumiOdenis / muddet;       // 9200 / 12 = 766.66...

        System.out.println("Ümumi faiz:    " + umumiFaiz + " AZN");
        System.out.println("Ümumi ödəniş:  " + umumiOdenis + " AZN");
        System.out.println("Aylıq ödəniş:  " + aylikOdenis + " AZN");
    }
}
