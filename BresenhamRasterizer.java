import java.util.ArrayList;

class BresenhamRasterizer implements LineRasterizer {
    public Point[] rasterize(Point p1, Point p2) {
        // Initialization
        ArrayList<Point> points = new ArrayList<>();

        int x1 = p1.x;
        int y1 = p1.y;
        int x2 = p2.x;
        int y2 = p2.y;

        return new Point[]{ new Point(0,0), new Point(2,3) };
    }

}
