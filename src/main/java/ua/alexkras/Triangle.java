package ua.alexkras;

import ua.kpi.tef.Point;
import ua.kpi.tef.Shape;

public class Triangle extends Shape {

    private final Point A,B,C;

    private final double AB,BC,AC;

    public Triangle(Point A, Point B, Point C){

        int eps = 3;

        this.A = A;
        this.B = B;
        this.C = C;

        if (pointsAreEqual(A,B,eps) || pointsAreEqual(C,B,eps) ||
                pointsAreEqual(A,C,eps)){
            throw new IllegalArgumentException("Some points are equal. Can not create Triangle.");
        }

        AB = dist(A,B);
        BC = dist(B,C);
        AC = dist(A,C);

    }

    /**
     *
     * @param p1 Point 1
     * @param p2 Point 2
     * @param eps accuracy in decimal places (0<eps<9)
     * @return true if p1 & p2 coordinates are equal with accuracy eps, false otherwise.
     */
    private boolean pointsAreEqual(Point p1, Point p2, int eps){
        if (eps<0 | eps>8){
            throw new IllegalArgumentException("0<eps<9");
        }
        return ((long)(p1.getX()*Math.pow(10,eps))==(long)(p2.getX()*Math.pow(10,eps)) &
                (long)(p1.getY()*Math.pow(10,eps))==(long)(p2.getY()*Math.pow(10,eps)));
    }

    private double dist(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
    }

    @Override
    public double square(){
        double p = perimeter()/2;

        return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
    }

    @Override
    public double perimeter(){
        return AB+BC+AC;
    }

    @Override
    public void move(double dx, double dy){
        A.setX(A.getX()+dx);
        B.setX(B.getX()+dx);
        C.setX(C.getX()+dx);

        A.setY(A.getY()+dy);
        B.setY(B.getY()+dy);
        C.setY(C.getY()+dy);
    }

}
