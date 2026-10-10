public class exercice4 {
    public static void main(String[] args) {
        String ligneMeteo = "25.5,70,1012.3";

        String[] elements = ligneMeteo.split(",");

        try {
            double temperature = Double.parseDouble(elements[0]);
            int humidite = Integer.parseInt(elements[1]);
            double pression = Double.parseDouble(elements[2]);

            System.out.println("Température: " + temperature + "°C");
            System.out.println("Humidité: " + humidite + "%");
            System.out.println("Pression: " + pression + " hPa");

            double tempFahrenheit = (temperature * 9 / 5) + 32;
            double indiceConfort = (temperature * humidite) / 100;

            System.out.println("Température en Fahrenheit: " + tempFahrenheit + "°F");
            System.out.println("Indice de confort: " + indiceConfort);

        } catch (NumberFormatException e) {
            System.out.println("Erreur : les données météo sont mal formées.");
        }

        double temp1 = 24.0;
        double temp2 = 26.0;
        double temp3 = 25.5;

        double moyenneGlissante = (temp1 + temp2 + temp3) / 3;
        System.out.println("Moyenne glissante: " + moyenneGlissante + "°C");
    }
}