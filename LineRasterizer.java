class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

interface LineRasterizer {
    Point[] rasterize(Point p1, Point p2);
}

