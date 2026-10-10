public class exercice2 {
    public static void main(String[] args) {
        double centimetres = 254.0;

        double poucesDouble = centimetres / 2.54;
        int poucesInt = (int) poucesDouble;

        System.out.println("En double : " + poucesDouble);
        System.out.println("En int (cast explicite) : " + poucesInt);

        long poucesArrondi = Math.round(poucesDouble);
        System.out.println("Arrondi avec Math.round() : " + poucesArrondi);

        float prixArticle = 12.99f;
        int quantite = 3;
        double total = prixArticle * quantite;
        System.out.printf("Total : %.2f%n", total);

        int grandNombre = 2_000_000_000;
        byte grandNombreByte = (byte) grandNombre;
        System.out.println("Résultat du cast en byte : " + grandNombreByte);
    }
}