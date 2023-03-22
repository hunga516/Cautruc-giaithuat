import java.util.Scanner;

public class HoaQua {
    private String ten, xuatXu;
    private double giaBan;
    private int ngayNhap, soLuong;
    private double soKg;

    public HoaQua() {
    }

    public HoaQua(String ten, String xuatXu, double giaBan, int ngayNhap, int soLuong, double soKg) {
        super();
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.soKg = soKg;
    }

    public double getSoKg() {
        return soKg;
    }

    public void setSoKg(double soKg) {
        this.soKg = soKg;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String toString() {
        return "ten=" + ten + ", xuatXu=" + this.xuatXu + ", giaBan=" + giaBan + "/kg " + ", ngayNhap=" + ngayNhap
                + ", soLuong=" + soLuong;
    }

    public double tinhTien() {
        return this.giaBan * this.soKg;
    }

public class QuaCam extends HoaQua{
    private String color = "Cam";

    public QuaCam() {
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public QuaCam(String ten, String xuatXu, double giaBan, int ngayNhap, int soLuong, double soKg) {
        super(ten, xuatXu, giaBan, ngayNhap, soLuong, soKg);
    }

    @Override
    public String toString() {
        return (super.toString() + "màu : " + this.color);
    }
}


public class QuaTao extends HoaQua {
    private String color = "Đỏ";

    public QuaTao() {
    }

    public QuaTao(String ten, String xuatXu, double giaBan, int ngayNhap, int soLuong, double soKg) {
        super(ten, xuatXu, giaBan, ngayNhap, soLuong, soKg);
    }

    @Override
    public String toString() {
        return (super.toString() + "màu : " + this.color);
    }
}

public class QuaCamSanh extends QuaCam {
    public QuaCamSanh() {
    }

    public QuaCamSanh(String ten, String xuatXu, double giaBan, int ngayNhap, int soLuong, double soKg) {
        super(ten, xuatXu, giaBan, ngayNhap, soLuong, soKg);
    }

    @Override
    public String toString() {
        return (super.toString() + "màu : " + super.getColor());
    }
}

public class CamCaoPhong extends QuaCam {
    public CamCaoPhong() {
    }

    public CamCaoPhong(String ten, String xuatXu, double giaBan, int ngayNhap, int soLuong, double soKg) {
        super(ten, xuatXu, giaBan, ngayNhap, soLuong, soKg);
    }

    @Override
    public String toString() {
        return (super.toString() + "màu : " + super.getColor());
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoaQua qc = new HoaQua();
        System.out.println("Nhập tên ");
        qc.setTen(sc.nextLine());
        System.out.println("Nhập giá bán ");
        qc.setGiaBan(sc.nextDouble());
        System.out.println("Nhập số kg muốn mua ");
        qc.setSoKg(sc.nextDouble());
        System.out.println("nhập nguồn gốc ");
        qc.setXuatXu(sc.nextLine());
        System.out.println("Nhập số lượng hiện có ");
        qc.setSoLuong(sc.nextInt());
        System.out.println(qc);

    
    }
}

