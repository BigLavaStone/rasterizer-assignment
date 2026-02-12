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

        // Delta & Slope Calculation
        if (steep) {
            int temp;
            temp = x1; x1 = y1; y1 = temp;
            temp = x2; x2 = y2; y2 = temp;
        }

        if (x1 > x2) {
            int temp;
            temp = x1; x1 = x2; x2 = temp;
            temp = y1; y1 = y2; y2 = temp;
        }

        float dx = x2 - x1;
        float dy = y2 - y1;
        float gradient = dy / dx;

        float y = y1;

        return points.toArray(new Point[0]);
    }    
}
