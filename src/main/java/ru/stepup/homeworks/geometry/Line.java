package ru.stepup.homeworks.geometry;

public class Line implements Measurable {
    Point begin;
    Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double getLength() {
        double dx = end.x - begin.x;
        double dy = end.y - begin.y;
        double length = Math.sqrt(dx * dx + dy * dy);
        return Math.round(length * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Линия от " + begin + " до " + end;
    }
}
