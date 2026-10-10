import java.util.Scanner;

public class Semestre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAnnees = 3;
        int semestresParAnnee = 2;
        double sommeMoyennesAnnees = 0;

        for (int annee = 1; annee <= totalAnnees; annee++) {
            System.out.println("            ANNÉE " + annee);

            double sommeMoyennesSemestresAnnee = 0;

            for (int sem = 1; sem <= semestresParAnnee; sem++) {
                System.out.println("\nSemestre " + sem + " (Année " + annee + ")");

                System.out.print("Nombre de modules pour ce semestre : ");
                int nbModules = sc.nextInt();
                sc.nextLine();

                String[] modules = new String[nbModules];
                double[] notes = new double[nbModules];
                double sommeNotesSemestre = 0;

                for (int i = 0; i < nbModules; i++) {
                    System.out.print("Nom du module " + (i + 1) + " : ");
                    modules[i] = sc.nextLine();

                    do {
                        System.out.print("Note de " + modules[i] + " (0-20) : ");
                        notes[i] = sc.nextDouble();
                    } while (notes[i] < 0 || notes[i] > 20);

                    sc.nextLine();
                    sommeNotesSemestre += notes[i];
                }

                double moyenneSemestre = sommeNotesSemestre / nbModules;
                sommeMoyennesSemestresAnnee += moyenneSemestre;

                System.out.println("\n> Résultat Semestre " + sem + " :");
                for (int i = 0; i < nbModules; i++) {
                    String etatModule = (notes[i] >= 10) ? "Validé" : "Non validé";
                    System.out.println("  - " + modules[i] + " : " + notes[i] + "/20 [" + etatModule + "]");
                }
                String etatSemestre = (moyenneSemestre >= 10) ? "VALIDÉ" : "NON VALIDÉ";
                System.out.printf("  => MOYENNE SEMESTRE %d : %.2f/20 [%s]%n", sem, moyenneSemestre, etatSemestre);
            }

            double moyenneAnnee = sommeMoyennesSemestresAnnee / semestresParAnnee;
            sommeMoyennesAnnees += moyenneAnnee;

            String etatAnnee = (moyenneAnnee >= 10) ? "VALIDÉE" : "NON VALIDÉE";
            System.out.printf(">>> MOYENNE ANNÉE %d : %.2f/20 [%s]%n", annee, moyenneAnnee, etatAnnee);
        }

        double moyenneGlobale = sommeMoyennesAnnees / totalAnnees;
        System.out.printf("MOYENNE GLOBALE DU CURSUS (3 ANS) : %.2f/20%n", moyenneGlobale);
        System.out.println("DIPLÔME : " + (moyenneGlobale >= 10 ? "OBTENU !" : "NON OBTENU"));

        sc.close();
    }
}