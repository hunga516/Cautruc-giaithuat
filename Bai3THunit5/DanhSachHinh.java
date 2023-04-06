package Bai3THunit5;

import java.util.ArrayList;


public class DanhSachHinh {
	private ArrayList<Hinh> danhSach ;

	public DanhSachHinh() {
		this.danhSach= new ArrayList<Hinh>();
	}
	public DanhSachHinh(ArrayList<Hinh> danhSach) {
		this.danhSach = danhSach;
	}
	public void Them(Hinh h1) {
		this.danhSach.add(h1);
	}
	public void inDanhSach() {
		for (Hinh hinh : danhSach) {
			System.out.println(hinh);
		}
	}

}