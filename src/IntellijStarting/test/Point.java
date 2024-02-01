package IntellijStarting.test;

public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        Point b = new Point(0, 0);
        return Math.sqrt((b.x - this.x) * (b.x - this.x) + (b.y - this.y) * (b.y - this.y));
    }
    public double distance(int xA,int yA){
        return Math.sqrt((this.x - xA) * (this.x - xA) + (this.y - yA) * (this.y - yA));
    }
    public double distance(Point a) {
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
}
