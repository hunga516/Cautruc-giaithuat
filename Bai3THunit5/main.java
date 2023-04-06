package Bai3THunit5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhTron hinhTron = new HinhTron();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        System.out.println("nhap ban kinh:");
        hinhTron.setBanKinh(sc.nextFloat());

        System.out.println("Nhap cd va cr:");
        hinhChuNhat.setCd(sc.nextFloat());
        hinhChuNhat.setCr(sc.nextFloat());

        System.out.println("Thong tin hinh tron:" + hinhTron.toString());
        System.out.println("Thong tin hinh chu nhat:"+ hinhChuNhat.toString());

        System.out.println(
                "thong tin hinh tron: " + hinhTron.toString() + " dien tich cua no la: " + hinhTron.dienTich());
        System.out.println("thong tin hinh chu nhat la: " + hinhChuNhat.toString() + "\n" + " dien tich cua no la: "
                + hinhChuNhat.dienTich());

        DanhSachHinh dsh = new DanhSachHinh();

        System.out.println("cac hinh nam trong mang la");
        dsh.Them(hinhChuNhat);
        dsh.Them(hinhTron);
        dsh.inDanhSach(); 
    }

}
