import java.util.Scanner;

class Circle {
    private double radius;
    protected String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        super();
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return ("Volume:" + getVolume() + "\nArea" + super.getArea() + "\nColor:" + this.color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.println("Nhap ban kinh:");
        c.setRadius(sc.nextDouble());
        sc.nextLine();
        System.out.println("Nhap mau sac:");
        c.setColor(sc.nextLine());
        System.out.println("Nhap chieu cao:");
        c.setHeight(sc.nextDouble());
        System.out.println(c.toString());
        System.out.println("Dien tich:" + c.getArea());
        System.out.println("The tich:" + c.getVolume());
    }
}
