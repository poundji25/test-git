public class Ligne extends Forme
{
    private Point p1;
    private Point p2;
    public Ligne(int ID,Point p1,Point p2)
    {
        this.ID=ID;
        this.p1=p1;
        this.p2=p2;
    }

    @Override
    public String afficher()
    {
        return "/ Ligne / ( "+p1.getPoint()+" , "+p2.getPoint()+" )";
    }

    @Override
    public void deplacer(double x, double y)
    {
        p1.setX(p1.getX()+x); p1.setY(p1.getY()+y);
        p2.setX(p2.getX()+x); p2.setY(p2.getY()+y);
    }

    @Override
    public int getFormeID() {
        return 1;
    }

    @Override
    public int getID() {
        return this.ID;
    }
}
