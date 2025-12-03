package ru.stepup.homeworks;

import java.util.ArrayList;
import java.util.List;

public class PolyLine implements Measurable {
    List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public double getLength() {
        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            double dx = nextPoint.x - currentPoint.x;
            double dy = nextPoint.y - currentPoint.y;
            totalLength += Math.sqrt(dx * dx + dy * dy);
        }
        return Math.round(totalLength * 100.0) / 100.0;
    }

    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            Point startPoint = points.get(i);
            Point endPoint = points.get(i + 1);
            lines.add(new Line(startPoint, endPoint));
        }
        return lines;
    }

    @Override
    public String toString() {
        return "Линия " + points;
    }
}
