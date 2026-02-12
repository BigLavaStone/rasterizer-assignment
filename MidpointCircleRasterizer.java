import java.util.ArrayList;

public class MidpointCircleRasterizer implements LineRasterizer{
    public Point[] rasterize(Point p1, Point p2) {

        // Initialization

        ArrayList<Point> points = new ArrayList<>();

        int cx = (p1.x + p2.x) / 2;
        int cy = (p1.y + p2.y) / 2;

        int radius = (int)(Math.hypot(p2.x - p1.x, p2.y - p1.y) / 2);
        
        return points.toArray(new Point[0]);
    }
}
