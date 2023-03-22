class giaiptbac2oop {
     private double a, b, c;

     public giaiptbac2oop() {

     }

     public giaiptbac2oop(double a, double b, double c) {
          this.a = a;
          this.b = b;
          this.c = c;
     }

     public void setA() {
          this.a = a;
     }

     public void setB() {
          this.b = b;
     }

     public void setC() {
          this.c = c;
     }

     public double getA() {
          return this.a;
     }

     public double getB() {
          return this.b;
     }

     public double getC() {
          return this.c;
     }

     public void timnghiemPT() {
          if (this.a == 0) {
               if (this.b == 0) {
                    if (this.c == 0) {
                         System.out.println("PT vo so nghiem");
                    } else {
                         System.out.println("Pt co vo nghiem");
                    }

               } else {
                    double x = -this.c / this.b;
                    System.out.println("Nghiem cua pt la" + x);
               }
          }
          
     }
}