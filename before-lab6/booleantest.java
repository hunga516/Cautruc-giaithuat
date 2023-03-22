import java.util.Scanner;
public class booleantest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean checkA = a >= 0;
        boolean checkB = b >= 0;
        if (checkA && checkB) {
            System.out.println("Yes sir");
        } else {
            System.out.println("No sir");
        }
    }
}
