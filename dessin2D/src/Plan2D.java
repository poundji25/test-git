import java.util.ArrayList;
import java.util.Scanner;


public class Plan2D
{
    private ArrayList<Forme> les_formes;
    private int compteurID;

    public Plan2D ()
    {
        compteurID=0;
        les_formes=new ArrayList<Forme>();
        System.out.println("\n                        NOUVEAU PLAN                      \n");
    }
   public void vider ()
   {
       les_formes.clear();
       compteurID=0;
   }

   public void ajouter(int formID) throws samePointException, rayonException, saiseException {

       Forme F = ajout(formID);
       if (F!=null)
       {
           les_formes.add(F);
       }
       else
       {
           throw new saiseException("erreur de saisie ");
       }
   }

    private Forme ajout(int ID) throws samePointException, rayonException {
        int co;
        Scanner sc=new Scanner(System.in);
       if(ID!=1 && ID!=2 && ID!=3 && ID !=4)
       {
           return null;
       }
       else {
           if (ID == 1) {
               System.out.println("veuillez entrez les cordonnées de deux points appartenant à la ligne\nPoint 1 (x,y) : ");
               Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
               System.out.println("Point 2 (x,y) : ");
               Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
                co=compteurID;
                compteurID++;
               if(p1.getY()==p2.getY() && p1.getX()==p2.getX())
               {
                   throw new samePointException("cordonnées non valide");
               }
               return new Ligne(co,p1,p2);
           }
           if (ID == 2) {
               System.out.println("veuillez entrez les cordonnées de deux points opposés (n'ont pas les memes ordonnées et/ou abscisses) appartenant au rectangle :\n Point 1 (x,y) : ");
               Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
               System.out.println("Point 2 (x,y) : ");
               Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
               co=compteurID;
               compteurID++;
               if(p1.getY()==p2.getY() && p1.getX()==p2.getX())
               {
                   throw new samePointException("cordonnées non valide");
               }
               return new Rectangle(co,p1, p2);

           }
           if (ID == 3) {
               System.out.println("veuillez entrez le centre et le rayon du cercle :\n le centre (x,y) : ");
               Point centre = new Point(sc.nextDouble(), sc.nextDouble());
               System.out.println("le rayon : ");
               double rayon = sc.nextDouble();
               if (rayon < 0)
               {
                   throw new rayonException("rayon non valide");
               } else {
                   co=compteurID;
                   compteurID++;
                   return new Cercle(co,centre, rayon);
               }

           }
           if (ID == 4) {
               System.out.println("Veuillez entrez les trois points du triangle et la longeur des cotés :\nPoint 1 (x,y) : ");
               Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
               System.out.println("Point 2 (x,y) : ");
               Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
               System.out.println("Point 3 (x,y) : ");
               Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
               co=compteurID;
               compteurID++;
               return new Triangle(co,p1, p2, p3);
           }
       }
       return null;
    }

   public void déplacer (int ID) throws wrongIDException
   {
       if(ID>compteurID || ID<0)
       {
            System.out.println("l'identifiant est incorrecte\n");
       }
       else {
           int i;
           Scanner sc = new Scanner(System.in);
           for (i=0;i<les_formes.size();i++)
           {
               if (les_formes.get(i).getID() == ID)
               {
                   System.out.println("veuillez entrez deux valeurs flotantes pour déplacer la forme " + les_formes.get(i).getID());
                   les_formes.get(i).deplacer(sc.nextDouble(), sc.nextDouble());
                   break;
               }
           }
           if(i==les_formes.size())
           {
                throw new wrongIDException("identifiant non valide");
           }
       }
   }
   public void afficher()
   {
       if(les_formes.size()==0)
       {
           System.out.println(" plan vide\n");
       }
       else {
           System.out.println("les formes du plan ( ID / forme / infos forme ) : ");
           for (Forme V : les_formes) {
               System.out.println(" "+V.getID()+" "+V.afficher());
           }
           System.out.println("");
       }
   }

   public void supprimer (int ID) throws supprimerException {
       int i;
       for (i=0;i<les_formes.size();i++)
       {
           if(les_formes.get(i).getID()==ID)
           {
               les_formes.remove(les_formes.get(i));
               break;
           }
       }
       if(i==les_formes.size())
       {
           throw new supprimerException("identifiant non valide");
       }
   }

}
