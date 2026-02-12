import java.util.ArrayList;

public class WuRasterizer implements LineRasterizer{
    public Point[] rasterize(Point p1, Point p2) {
        // Initialization
        ArrayList<Point> points = new ArrayList<>();

        int x1 = p1.x;
        int y1 = p1.y;
        int x2 = p2.x;
        int y2 = p2.y;

        boolean steep = Math.abs(y2 - y1) > Math.abs(x2 - x1);

        return points.toArray(new Point[0]);
    }    
}
