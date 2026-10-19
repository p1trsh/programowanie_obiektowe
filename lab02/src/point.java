public class point {
    double x;
    double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(point otherPoint){
        return Math.sqrt((this.x - otherPoint.x) * (this.x - otherPoint.x) + (this.y - otherPoint.y) * (this.y - otherPoint.y));
    }
}
