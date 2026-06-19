public class DeqiqeCevir {
    public static void main(String[] args) {
        // 1-ci dəyər: 145
        int umumiDeqiqe = 145;
        int saat = umumiDeqiqe / 60;        // 145 / 60 = 2
        int qalanDeqiqe = umumiDeqiqe % 60; // 145 % 60 = 25
        System.out.println(umumiDeqiqe + " dəqiqə = " + saat + " saat " + qalanDeqiqe + " dəqiqə");

        // 2-ci dəyər: 90
        int umumiDeqiqe2 = 90;
        int saat2 = umumiDeqiqe2 / 60;        // 90 / 60 = 1
        int qalanDeqiqe2 = umumiDeqiqe2 % 60; // 90 % 60 = 30
        System.out.println(umumiDeqiqe2 + " dəqiqə = " + saat2 + " saat " + qalanDeqiqe2 + " dəqiqə");

        // 3-cü dəyər: 200
        int umumiDeqiqe3 = 200;
        int saat3 = umumiDeqiqe3 / 60;        // 200 / 60 = 3
        int qalanDeqiqe3 = umumiDeqiqe3 % 60; // 200 % 60 = 20
        System.out.println(umumiDeqiqe3 + " dəqiqə = " + saat3 + " saat " + qalanDeqiqe3 + " dəqiqə");
    }
}
