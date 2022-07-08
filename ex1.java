import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Quel est ton prénom ? ");
        String prenom = input.nextLine();

        System.out.print("Quel est ton nom ? ");
        String nom = input.nextLine();        

        input.close();

        DisplayName(prenom, nom);
    }
    static void DisplayName(String _prenom, String _nom){
        System.out.println(_prenom + " " + _nom);
    }
}