import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe und Überprüfung des Startwerts
        int startwert = getValidNumber(scanner, "Bitte geben Sie den Startwert ein: ");

        // Eingabe und Überprüfung des Endwerts
        int endwert;
        while (true) {
            endwert = getValidNumber(scanner, "Bitte geben Sie den Endwert ein: ");
            if (endwert > startwert) {
                break;
            } else {
                System.out.println("Fehler: Der Endwert muss größer dem Startwert sein.");
            }
        }

        // Eingabe und Überprüfung der Schrittweite
        int schrittweite;
        while (true) {
            schrittweite = getValidNumber(scanner, "Bitte geben Sie die Schrittweite ein: ");
            if (schrittweite > 0) {
                break;
            } else {
                System.out.println("Fehler: Die Schrittweite muss eine positive Zahl sein.");
            }
        }

        // Ausgabe der nummerierten Liste
        System.out.println("Nummerierte Liste:");
        for (int i = startwert; i <= endwert; i += schrittweite) {
            System.out.println(i);
        }

        scanner.close();
    }

    // Methode zur Validierung der Eingabe
    public static int getValidNumber(Scanner scanner, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Puffer leeren
                return number;
            } else {
                System.out.println("Fehler: Bitte geben Sie eine gültige ganze Zahl ein.");
                scanner.nextLine(); // Ungültige Eingabe aus dem Puffer entfernen
            }
        }
    }
}
