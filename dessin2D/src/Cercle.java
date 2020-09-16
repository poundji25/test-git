public class Cercle extends Forme
{
    private double rayon;
    private Point centre;
    public Cercle (int ID,Point centre,double rayon)
    {
        this.ID=ID;
        this.centre=centre;
        this.rayon=rayon;
    }
    @Override
    public String afficher()
    {
        return "/ Cercle / "+centre.getPoint()+" / rayon : "+rayon;
    }

    @Override
    public void deplacer(double x,double y)
    {
        centre.setX(centre.getX()+x);
        centre.setY(centre.getY()+y);
    }

    @Override
    public int getFormeID() {
        return 3;
    }

    @Override
    public int getID() {
        return this.ID;
    }
}
