import java.util.Scanner;

public class student {
        public String name ;
        public String lophoc;
        protected int resultmath;
        protected int resultphysics;
        protected int resultchemistry; 

public student (){   
    super();    
}

public student (String name , String lophoc , int resultmath, int resultphysics, int resultchemistry){
    this.name = name;
    this.lophoc = lophoc;
    this.resultmath = resultmath;
    this.resultphysics = resultphysics;
    this.resultchemistry = resultchemistry;
}

public int getResultchemistry(){
return resultchemistry;
}
public void setResultchemistry(int resultchemistry){
    this.resultchemistry=resultchemistry;
}

public int getResultmath(){
    return resultmath;
    }
public void setResultmath(int resultmath){
        this.resultmath=resultmath;
    }

public int getResultphysics(){
        return resultphysics;
        }
public void setResultphysics(int resultphysics){
            this.resultphysics=resultphysics;
        }

public double tinhDiemtrungbinh(){
   return (this.resultchemistry+this.resultmath+this.resultphysics)/3;
}

public String toString() {
    return"student{name="+name+" , "+lophoc+" , "+resultchemistry+" , "+resultmath+", "+resultphysics+"\nDiem trung binhh:"+ tinhDiemtrungbinh()+"}";
}
 class Hocsinhchuyentoan extends student {

        Hocsinhchuyentoan(){
        }    

    public Hocsinhchuyentoan (String name , String lophoc , int resultmath, int resultphysics, int resultchemistry){
        super(name,lophoc,resultchemistry,resultmath,resultphysics);
 }

 public double tinhDiemtrungbinh(){
 return (this.resultmath*this.resultmath+this.resultchemistry+this.resultphysics)/4;
 }

 public String toString() {
    return "Diem trung binh mon chuyen toan cua hoc sinh nay la:" + tinhDiemtrungbinh();
}
}

public class MainClass { 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    student std = new student();
    std.setResultchemistry(sc.nextInt());
    std.setResultmath(sc.nextInt());
    std.setResultphysics(sc.nextInt());

    std.new Hocsinhchuyentoan();
    System.out.println(std.toString());

    student gt = std.new Hocsinhchuyentoan();
    System.out.println(gt.toString());

       
       sc.close();
    }
}
}

