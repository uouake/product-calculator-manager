import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculateur de panier ===");
        System.out.println("Quel type de client êtes-vous ?");
        System.out.println("1 - Particulier");
        System.out.println("2 - Professionnel");

        int type = readInt(scanner, "Votre choix (1 ou 2) : ", 1, 2, "Choix invalide. Veuillez entrer 1 pour Particulier ou 2 pour Professionnel.");

        double priceHG, priceMG, priceLaptop;

        if (type == 1) {
            System.out.print("ID client : ");
            String id = scanner.nextLine();
            System.out.print("Nom : ");
            String nom = scanner.nextLine();
            System.out.print("Prénom : ");
            String prenom = scanner.nextLine();

            priceHG     = 1500.0;
            priceMG     =  800.0;
            priceLaptop = 1200.0;

            System.out.printf("Client Particulier [ID=%s] %s %s%n", id, prenom, nom);

        } else {
            System.out.print("ID client : ");
            String id = scanner.nextLine();
            System.out.print("Raison sociale : ");
            String raison = scanner.nextLine();
            System.out.print("Numéro de TVA intra (ou laisser vide) : ");
            String tva = scanner.nextLine();
            System.out.print("SIREN : ");
            String siren = scanner.nextLine();
            double ca = readDouble(scanner, "Chiffre d'affaires annuel (en euros) : ", "Entrée invalide. Veuillez entrer un nombre pour le chiffre d'affaires.");

            if (ca > 10_000_000) {
                priceHG     = 1000.0;
                priceMG     =  550.0;
                priceLaptop =  900.0;
            } else {
                priceHG     = 1150.0;
                priceMG     =  600.0;
                priceLaptop = 1000.0;
            }

            System.out.printf("Client Professionel [ID=%s] (Raison: %s) (SIREN=%s)%n", id, raison, siren);
        }

        int qHG     = readInt(scanner, "Quantité de téléphones haut de gamme : ");
        int qMG     = readInt(scanner, "Quantité de téléphones milieu de gamme : ");
        int qLaptop = readInt(scanner, "Quantité de laptop : ");

        double total = qHG * priceHG + qMG * priceMG + qLaptop * priceLaptop;
        System.out.printf("Total du panier : %.2f €%n", total);

        scanner.close();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            }
        }
    }

    private static int readInt(Scanner scanner, String prompt, int min, int max, String errorMsg) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                int val = Integer.parseInt(line);
                if (val >= min && val <= max) {
                    return val;
                } else {
                    System.out.println(errorMsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
    }


    private static double readDouble(Scanner scanner, String prompt, String errorMsg) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
    }
}
