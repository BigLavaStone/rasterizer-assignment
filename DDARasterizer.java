import java.util.ArrayList;

public class DDARasterizer implements LineRasterizer  {
    public Point[] rasterize(Point p1, Point p2) {
        // Initialized DDA rasterizer structure
        ArrayList<Point> points = new ArrayList<>();

        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;

        return points.toArray(new Point[0]);
    }
}
