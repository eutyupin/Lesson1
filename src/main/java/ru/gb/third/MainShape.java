package ru.gb.third;

import java.util.ArrayList;
import java.util.List;

public class MainShape {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Circle());
        shapeList.add(new Rect());

        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}
