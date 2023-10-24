package Fundamentals.IntroductionInterface;

import Fundamentals.Model.Entities.AbstractShape;
import Fundamentals.Model.Entities.Circle;
import Fundamentals.Model.Entities.Rectangle;
import Fundamentals.Model.Enums.Color;

public class InheritanceInterface {
    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

    }
}
