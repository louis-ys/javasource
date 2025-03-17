package extend;

public class Triangle extends Shape {
    Point[] point1;

    public Triangle(Point[] point1) {
        this.point1 = point1;
    }

    void draw() {
        System.out.printf(" [p1 =%s, p2 =%s, p3 = %s, color = %s]\n",
                point1[0].getXY(), point1[1].getXY(), point1[2].getXY(), color);
    }

}
