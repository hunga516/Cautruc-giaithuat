public class Shape {
        public static void main(String[] args) {
            public class shape {
                   protected String color = "red";
                   protected boolean filled = true;
                   protected shape(){}
                   protected shape(String color, boolean filled){
                       this.color = color;
                       this.filled = filled;
                   }
                   public String getcolor(){
                       return this.color;
                   }
                   public void setcolor(String color){
                       this.color = color;
                   }
                   public boolean isFilled(){
                       return this.filled;
                   }
                   public void setFilled(boolean filled){
                       this.filled = true;
                   }
                   public String toString() {
                       return this.color+","+this.filled;
                   }
                } 
                public class rectangle extends shape{
                   protected double width = 1,length = 1;
                   public rectangle(){}
                   public rectangle(String color, boolean filled){
                       super(color,filled);
                       this.width = width;
                       this.length = length;
                   }
                   public double getWidth(){
                       return this. width;
                   }
                   public void setWidth(double width){
                       this.width = width;
                   }
                   public double getLenght(){
                       return this.length;
                   }
                   public void setLenght(double length){
                       this.length = length;
                   }
                   public double getArea(){
                       return this.length*this.width;
                   }
                   public double getPerimeter(){
                       return this.length*this.width*2;
                   }
                   public String toString(){
                       return this.getArea() +","+ this.getPerimeter();{
                   }
                } 
                public class square extends rectangle{
                   protected double side;
                   public square(){
                    
                   }
                   public square(double side){
                       this.side = side;
                   }
                   public square(String color, boolean filled, double side){
                       super(color, filled);
                       this.side = side;
                   }
                   public double getSide(){
                       return this.side;
                   }
                   public void setSide(double side){
                       this.side = side;
                   }
                   public void setWidth(double side){
                       this.width = side;
                   }
                   public void setLenght(double side){
                       this.length = side;
                   }
                   public String toString(){
                       return "side la: "+this.side;
                   }
                } 
                public class circle extends shape{
    
                   protected double radius = 1;
                   public circle(){}
                   public circle(String color, boolean filled, double radius){
                       super(color, filled);
                       this.radius=radius;
                   }
                   public double getRadius(){
                       return radius;
                   }
                   public void setRadius(double radius){
                       this.radius = radius;
                   }
                   public double getArea(){
                       return 3.14*this.radius*this.radius;
                   }
                   public double getPerimeter(){
                       return 3.14*2*this.radius;
                   }
                   public String toString(){
                       return this.getArea()+","+this.getPerimeter();
                   }
                }
                public class main {
                   public static void main(String[] args) {
                       circle circle1 = new circle();
                       rectangle rectangle1 = new rectangle();
                       square square1 = new square();
                   }
                }
}
