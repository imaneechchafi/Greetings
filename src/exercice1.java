public class exercice1 {
    public static void main(String[] args) {
        double nombre1 = 15.0;
        double nombre2 = 4.0;

        System.out.printf("Addition: %.2f + %.2f = %.2f%n", nombre1, nombre2, nombre1 + nombre2);
        System.out.printf("Soustraction: %.2f - %.2f = %.2f%n", nombre1, nombre2, nombre1 - nombre2);
        System.out.printf("Multiplication: %.2f * %.2f = %.2f%n", nombre1, nombre2, nombre1 * nombre2);
        System.out.printf("Division: %.2f / %.2f = %.2f%n", nombre1, nombre2, nombre1 / nombre2);
        System.out.printf("Modulo: %.2f %% %.2f = %.2f%n", nombre1, nombre2, nombre1 % nombre2);

        double resultat1 = nombre1 + nombre2 * 2;
        double resultat2 = (nombre1 + nombre2) * 2;

        System.out.printf("resultat1 = %.2f%n", resultat1);
        System.out.printf("resultat2 = %.2f%n", resultat2);

        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
    }
}