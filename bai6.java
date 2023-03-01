import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so diem:");
        float n = sc.nextFloat();
        if (n < 5){
            System.out.println("Ban la hoc sinh Kem");
        }
        else if (n>=5 && n<7){
            System.out.println("Ban la hoc sinh Trung Binh");
        }
        else if (n>=7 && n<8){
            System.out.println("Ban la hoc sinh Kha");
        }
        else {
            System.out.println("Ban la hoc sinh Gioi");
    }
    
}
}
