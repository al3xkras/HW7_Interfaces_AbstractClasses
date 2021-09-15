package ua.kpi.tef;

import ua.alexkras.Triangle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Triangle(new Point(3.0001,4.0001),
                new Point(7,6),
                new Point(3.0012,4.0002));
        System.out.println(shape);
    }
}
