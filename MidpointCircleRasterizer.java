import java.util.ArrayList;

public class MidpointCircleRasterizer implements LineRasterizer{
    public Point[] rasterize(Point p1, Point p2) {
        // Initialization
        ArrayList<Point> points = new ArrayList<>();

        int cx = (p1.x + p2.x) / 2;
        int cy = (p1.y + p2.y) / 2;

        int radius = (int)(Math.hypot(p2.x - p1.x, p2.y - p1.y) / 2);
        
        // Circle Parameters
        int x = 0;
        int y = radius;
        int d = 1 - radius;

        // Circle point calculation incremental
        while (x <= y) {

            // 8-way symmetry
            points.add(new Point(cx + x, cy + y));
            points.add(new Point(cx - x, cy + y));
            points.add(new Point(cx + x, cy - y));
            points.add(new Point(cx - x, cy - y));
            points.add(new Point(cx + y, cy + x));
            points.add(new Point(cx - y, cy + x));
            points.add(new Point(cx + y, cy - x));
            points.add(new Point(cx - y, cy - x));

            if (d < 0) {
                d += 2 * x + 3;
            } else {
                d += 2 * (x - y) + 5;
                y--;
            }

            x++;
        }

        return points.toArray(new Point[0]);
    }
}
