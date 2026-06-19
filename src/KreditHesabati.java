public class KreditHesabati {
    public static void main(String[] args) {
        // ===== MÜŞTƏRİ MƏLUMATLARI =====
        String musteriAdi = "Elvin Məmmədov";
        int yas = 35;
        double aylikGelir = 2500.0;

        double kreditMeblegi = 12000.0;
        int muddetAy = 24;
        double illikFaiz = 14.0;
        boolean kreditTarixi = true;   // keçmiş kredit tarixçəsi yaxşıdır?

        // ===== HESABLAMALAR =====
        double umumiFaiz = kreditMeblegi * (illikFaiz / 100);
        double aylikOdenis = (kreditMeblegi + umumiFaiz) / muddetAy;
        double gelireNisbet = (aylikOdenis / aylikGelir) * 100;

        // ===== BOOLEAN YOXLAMALAR =====
        boolean yasSerti = (yas >= 21 && yas <= 65);
        boolean gelirSerti = (aylikGelir > 800);
        boolean meblegSerti = (kreditMeblegi >= 300 && kreditMeblegi <= 50000);
        boolean nisbetSerti = (gelireNisbet < 40);   // təhlükəsiz hədd
        boolean tesdiqlenir = yasSerti && gelirSerti && meblegSerti
                && nisbetSerti && kreditTarixi;

        // ===== FORMATLI HESABAT =====
        System.out.println("========================================");
        System.out.println("        KREDİT HESABATI");
        System.out.println("========================================");
        System.out.println("Müştəri:          " + musteriAdi);
        System.out.println("Yaş:              " + yas);
        System.out.println("Aylıq gəlir:      " + aylikGelir + " AZN");
        System.out.println("----------------------------------------");
        System.out.println("Kredit məbləği:   " + kreditMeblegi + " AZN");
        System.out.println("Müddət:           " + muddetAy + " ay");
        System.out.println("İllik faiz:       " + illikFaiz + " %");
        System.out.println("Kredit tarixçəsi: " + kreditTarixi);
        System.out.println("----------------------------------------");
        System.out.println("Ümumi faiz:       " + umumiFaiz + " AZN");
        System.out.println("Aylıq ödəniş:     " + aylikOdenis + " AZN");
        System.out.printf("Gəlirə nisbət:    %.1f %%%n", gelireNisbet);
        System.out.println("----------------------------------------");
        System.out.println("Yaş şərti (21-65):       " + yasSerti);
        System.out.println("Gəlir şərti (>800):      " + gelirSerti);
        System.out.println("Məbləğ şərti (300-50k):  " + meblegSerti);
        System.out.println("Nisbət şərti (<40%):     " + nisbetSerti);
        System.out.println("========================================");
        System.out.println("KREDİT TƏSDİQLƏNİR:      " + tesdiqlenir);
        System.out.println("========================================");
    }
}