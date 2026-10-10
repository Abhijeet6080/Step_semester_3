package week_9.class_problems;

abstract class Plot {
    protected String owner;
    public Plot(String owner) { this.owner = owner; }
    public abstract double calculateArea();
    public abstract String getShape();
    public String getOwner() { return owner; }
}

class CirclePlot extends Plot {
    private double radius;
    public CirclePlot(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }
    @Override
    public double calculateArea() { return Math.PI * radius * radius; }
    @Override
    public String getShape() { return "CIRCLE"; }
}

class RectanglePlot extends Plot {
    private double length, width;
    public RectanglePlot(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() { return length * width; }
    @Override
    public String getShape() { return "RECTANGLE"; }
}

class TrianglePlot extends Plot {
    private double base, height;
    public TrianglePlot(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() { return 0.5 * base * height; }
    @Override
    public String getShape() { return "TRIANGLE"; }
}

public class GardenPlotReport {
    public static void main(String[] args) {
        Plot[] plots = {
            new CirclePlot("Asha", 5),
            new RectanglePlot("Ravi", 4, 6),
            new TrianglePlot("Neha", 10, 3)
        };

        double totalArea = 0;
        for (Plot p : plots) {
            double area = p.calculateArea();
            totalArea += area;
            System.out.printf("%s (%s): %.2f\n", p.getOwner(), p.getShape(), area);
        }
        System.out.printf("Total Area: %.2f\n", totalArea);
    }
}