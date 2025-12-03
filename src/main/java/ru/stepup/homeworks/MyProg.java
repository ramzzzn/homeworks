package ru.stepup.homeworks;

import java.util.ArrayList;
import java.util.List;

public class MyProg {
    public static void main(String[] args) {
        List<Point> pointsList = new ArrayList<>();
        pointsList.add(new Point(1, 5));
        pointsList.add(new Point(2, 8));
        pointsList.add(new Point(5, 3));
        pointsList.add(new Point(8, 9));
        Measurable polyLine = new PolyLine(pointsList);
        Measurable closedPolyLine = new ClosedPolyLine(pointsList);
        List<Measurable> measurables = new ArrayList<>();
        measurables.add(polyLine);
        measurables.add(closedPolyLine);
        processMeasurables(measurables);
    }

    static void processMeasurables(List<Measurable> measurables) {
        for (Measurable measurable : measurables) {
            System.out.println(measurable.getLength());
        }
    }
}
