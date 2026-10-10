import java.util.ArrayList;

public class exercice3 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(12);
        liste.add(-3);
        liste.add(8);
        liste.add(0);

        for (Integer val : liste) {
            System.out.println(val);
        }

        int min = liste.get(0);
        int max = liste.get(0);
        double somme = 0;

        for (int i = 0; i < liste.size(); i++) {
            int element = liste.get(i);

            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }

            somme += element;
        }

        double moyenne = somme / liste.size();

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Moyenne : " + moyenne);

        Integer objInt = 20;
        int primInt = objInt;
        System.out.println("primInt : " + primInt);
    }
}