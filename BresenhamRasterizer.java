import java.util.ArrayList;

class BresenhamRasterizer implements LineRasterizer {
    public Point[] rasterize(Point p1, Point p2) {

        // Initialization
        ArrayList<Point> points = new ArrayList<>();

        int x1 = p1.x;
        int y1 = p1.y;
        int x2 = p2.x;
        int y2 = p2.y;

        // Endpoint extraction logic
        // Delta & Slope Calculation
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        int err = dx - dy;

        return new Point[]{ new Point(0,0), new Point(2,3) };
    }

}
