import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quel est ton prénom ? ");
        String prenom = input.nextLine();

        System.out.print("Quel est ton nom ? ");
        String nom = input.nextLine();

        input.close();

        DisplayFullName(prenom, nom);

    }

    static void DisplayFullName(String _prenom, String _nom) {
        if (_prenom.equals("David") && _nom.equals("Dehoust")) {
            System.out.println("Bonjour admin");
        } else {
            System.out.println(_prenom + " " + _nom);
        }
    }

    static void DisplayFirstName(String _prenom) {
        System.out.println(_prenom);
    }
}