package ru.stepup.homeworks.geometry;

import java.util.List;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(List<Point> points) {
        super(points);
    }

    @Override
    public double getLength() {
        double totalLength = super.getLength();
        Point firstPoint = points.get(0);
        Point lastPoint = points.get(points.size() - 1);
        double dx = lastPoint.x - firstPoint.x;
        double dy = lastPoint.y - firstPoint.y;
        totalLength += Math.sqrt(dx * dx + dy * dy);
        return Math.round(totalLength * 100.0) / 100.0;
    }
}
