package Fundamentals.GenericsSetMap;

import Fundamentals.Model.Entities.Circle;
import Fundamentals.Model.Entities.Rectangle;
import Fundamentals.Model.Entities.Shape;
import Fundamentals.Model.Enums.Color;

import java.util.ArrayList;
import java.util.List;

public class DelimitedJokerType {
    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle(Color.BLACK, 3.0, 2.0));
        shapeList.add(new Circle(Color.BLACK, 2.0));

        System.out.printf("Total area: %.2f", totalArea(shapeList));
    }


    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;

        for (Shape s : list) {
            sum += s.area();
        }

        return sum;
    }
}
