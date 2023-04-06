package Bai3THunit5;

public class HinhChuNhat extends Hinh {
	private float cd;
	private float cr;
	public HinhChuNhat(float cd, float cr) {
		this.cd=cd;
		this.cr=cr;
	}
	public HinhChuNhat(){}
	public void setCd(float cd) {
		this.cd=cd;
	}
	public void setCr(float cr) {
		this.cr=cr;
	}
	@Override
	public String toString() {
		return "HinhChuNhat [cd=" + cd + ", cr=" + cr + "]";
	}
	public double dienTich() {
		return this.cd*this.cr;
	}

}