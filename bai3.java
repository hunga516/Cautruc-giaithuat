import java.util.Scanner;

public class bai3 {
    public static void tinhTienDien(int a){
        int tiendienhang1 = a*1000;
        if(a>=0&&a<=50)
    {
System.out.println("Tien dien cua ban la:"+tiendienhang1);
    }
    else if (a>50){
        System.out.println("Tien dien cua ban la:"+(50*1000+((a-50)*1200)));
    }
    else{
        System.out.println("Khong ton tai ban eii, nhap lon hon 0 di!!!");
    }

}
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    tinhTienDien(a);
}
}