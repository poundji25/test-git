import java.util.Scanner;

public class Main
{
    public static void main(String args[]) throws rayonException, saiseException, samePointException, wrongIDException, supprimerException {
        Plan2D plan = new Plan2D(); // creation du plan 2D
        Scanner sc= new Scanner(System.in);
        System.out.println("voici une liste des différentes formes géométriques que vous pouvez utiliser et les codes à saisir pour ajouter chacune d'elles:\n" +
                " '1' -> ligne\n '2' -> Rectangle\n '3' -> Cercle\n '4' -> Triangle");



        System.out.println("\n                    EXEMPLE D'UTILISATION DES METHODES DU PLAN            \n");

        System.out.println("AJOUTER UNE FORME ET AFFICHER LE PLAN\n");
        System.out.println("veuillez saisir le code de la forme que vous souhaitez ajouter ");
        plan.ajouter(sc.nextInt());
        plan.afficher();

        System.out.println("AJOUTER UN FORME ET AFFICHER LE PLAN\n");
        System.out.println("veuillez saisir le code de la forme que vous souhaitez ajouter ");
        plan.ajouter(sc.nextInt());
        plan.afficher();

        System.out.println("DEPLACER UNE FORME ET AFFICHER LE PLAN\n");
        plan.déplacer(0); // déplacer la forme (ID : 0)
        plan.afficher();

        System.out.println("SUPPRIMER UNE FORME ET AFFICHER LE PLAN \n");
        plan.supprimer(0);
        plan.afficher();

        System.out.println("VIDER LE PLAN ET L'AFFICHER\n");
        plan.vider(); // vider le plan des formes
        plan.afficher();

    }
}
