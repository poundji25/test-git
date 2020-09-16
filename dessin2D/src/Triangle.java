public class Triangle extends Forme
{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle (int ID,Point p1,Point p2,Point p3)
    {
        this.ID=ID;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    @Override
    public String afficher()
    {
        return "/ Triangle / ( "+p1.getPoint()+" , "+p2.getPoint()+" , "+p3.getPoint()+" )";
    }

    @Override
    public void deplacer(double x, double y)
    {
        p1.setX(p1.getX()+x); p1.setY(p1.getY()+y);
        p2.setX(p2.getX()+x); p2.setY(p2.getY()+y);
        p3.setX(p3.getX()+x); p3.setY(p3.getY()+y);
    }

    @Override
    public int getFormeID() {
        return 4;
    }

    @Override
    public int getID() {
        return this.ID;
    }
}
