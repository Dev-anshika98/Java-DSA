class Point2D{
    int x;
    int y;
    void display()
    {
        System.out.println("x="+"y="+y);
    }
}
class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println("x="+x+"y="+y+"z="+z);
    }
}

public class inheritance{
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        p1.x=4;
        p1.y=5;
        System.out.println("Point2D P1 is");
        p1.display();
        p2.x=5;
        p2.y=6;
        System.out.println("Point 3D p2 is");
        p2.display();
    }
}