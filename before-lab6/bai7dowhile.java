import java.util.Scanner;

public class bai7dowhile {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Vui long nhap 1 so nguyen a khac 0");
         a = sc.nextInt();
        }
        while ( a == 0);
    }
}
