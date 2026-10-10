import java.util.Scanner;

public class Generateur_sequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Combien de termes de Fibonacci souhaitez-vous afficher ? : ");
        int limite = input.nextInt();

        if (limite <= 0) {
            System.out.println("Veuillez entrer un nombre supérieur à 0.");
        } else {
            afficherFibonacci(limite);
        }

        input.close();
    }

    public static void afficherFibonacci(int count) {
        System.out.println("Suite de Fibonacci (" + count + " termes) :");

        int premier = 0;
        int second = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(premier + " ");

            // Calcul du terme suivant et décalage
            int suivant = premier + second;
            premier = second;
            second = suivant;
        }
        System.out.println();
    }
}