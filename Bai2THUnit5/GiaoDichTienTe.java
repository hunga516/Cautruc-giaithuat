package Bai2THUnit5;

public class GiaoDichTienTe extends GiaoDich {
    private String loaiTien;
	private double tiGia;
	public GiaoDichTienTe() {
		
	}
	public GiaoDichTienTe(String loaiTien, double tiGia,String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong) {
		super(maGiaoDich,ngayGiaoDich,donGia,soLuong);
		this.loaiTien = loaiTien;
		this.tiGia = tiGia;
	}
	@Override
	public double ThanhTien() {
        if (loaiTien.equals("VND")) {
            return super.getSoLuong() * super.getDonGia();
        } else {
            return super.getSoLuong() * super.getDonGia() * this.tiGia;
        }
}
}
