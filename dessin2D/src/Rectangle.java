public class Rectangle extends Forme
{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Rectangle (int ID,Point p1,Point p2)
    {
        this.ID=ID;
        this.p1=p1;
        this.p2=p2;

        if(!(p1.getX() == p2.getX() && p1.getY() == p2.getY())) {
            if (p1.getX() == p2.getX()) {
                this.p3 = new Point(p1.getX(), p1.getY());
                this.p4 = new Point(p1.getX(), p2.getY());
            } else {
                if (p1.getY() == p2.getY())
                {
                    this.p3 = new Point(p1.getX(), p1.getY());
                    this.p4 = new Point(p2.getX(), p1.getY());
                }
                else
                {
                    this.p3=new Point(p1.getX(),p2.getY());
                    this.p4=new Point(p2.getX(),p1.getY());
                }
            }
        }
    }
    @Override
    public String afficher()
    {
        return "/ Rectangle / ( "+p1.getPoint()+" , "+p2.getPoint()+" , "+p3.getPoint()+" , "+p4.getPoint()+" )";
    }

    @Override
    public void deplacer(double x, double y)
    {
        p1.setX(p1.getX()+x); p1.setY(p1.getY()+y);
        p2.setX(p2.getX()+x); p2.setY(p2.getY()+y);
        p3.setX(p3.getX()+x); p3.setY(p3.getY()+y);
        p4.setX(p4.getX()+x); p4.setY(p4.getY()+y);
    }

    @Override
    public int getFormeID() {
        return 2;
    }

    @Override
    public int getID() {
        return this.ID;
    }
}
