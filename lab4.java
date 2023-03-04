class Circle {
    private double radius;
    private String color;

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

    public void setRadius() {
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

    public  String ToString(){
          return ("Radius:"+this.radius+"/n Color:"+this.color);
    }
}

    class Cylinder extends Circle {
        private double height;

    public Cylinder(double height, double  radius, String color){
        super(radius, color);
        this.height = height;

    }

    public double GetHeight() {
        return height;
    }

    public void SetHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    }