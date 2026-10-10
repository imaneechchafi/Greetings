import java.util.Scanner;

public class Calculatricesimple {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saisir le premier nombre : ");
        double a = input.nextDouble();

        System.out.print("Saisir le second nombre : ");
        double b = input.nextDouble();

        System.out.print("Choix de l'opération (+, -, *, /) : ");
        String op = input.next();

        if (op.equals("+")) {
            System.out.println("Résultat : " + (a + b));
        } else if (op.equals("-")) {
            System.out.println("Résultat : " + (a - b));
        } else if (op.equals("*")) {
            System.out.println("Résultat : " + (a * b));
        } else if (op.equals("/")) {
            if (b != 0) {
                System.out.println("Résultat : " + (a / b));
            } else {
                System.out.println("Erreur : Division par zéro impossible.");
            }
        } else {
            System.out.println("Opération inconnue.");
        }

        input.close();
    }
}