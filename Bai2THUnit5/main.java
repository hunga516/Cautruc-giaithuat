package Bai2THUnit5;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
		GiaoDich giaodich1= new GiaoDichVang("ms1",4,750000,3,"4444");
		GiaoDich giaodich2= new GiaoDichVang("ms2",12,604000,12,"pnj");
		System.out.println("gia tien vang 1: " +giaodich1.ThanhTien());
		System.out.println("gia tien vang 2: " +giaodich2.ThanhTien());
		
		GiaoDich giaodich3= new GiaoDichTienTe("VND",1,"gd1",3,500000,10);
		GiaoDich giaodich4= new GiaoDichTienTe("Dolar",25000,"gd1",3,5000,10);
		System.out.println("gia tien tien viet : " +giaodich3.ThanhTien());
		System.out.println("gia tien tien do : " +giaodich4.ThanhTien());
		
	}
}
