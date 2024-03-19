package IntellijStarting.test;

public class MainWall {
    private double width;
    private double height;

    public static void main(String[] args) {
        MainWall mainWall = new MainWall(5,4);
        System.out.println("area= " + mainWall.getArea());
        mainWall.setHeight(-1.5);
        System.out.println("width= " + mainWall.getWidth());
        System.out.println("height= " + mainWall.getHeight());
        System.out.println("area= " + mainWall.getArea());
    }

    public MainWall() {
    }

    public MainWall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0) this.width = 0;
        if (height < 0) this.height = 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) this.width = 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height < 0) this.height = 0;
    }

    public double getArea() {
        return width * height;
    }
}
