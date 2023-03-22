public class hocSinhChuyenToan extends HocSinh {
    public hocSinhChuyenToan() {
    }

    public hocSinhChuyenToan(String name, String className, int toan, int ly, int hoa) {
        super(name, className, toan, ly, hoa);
    }

    @Override
    public double tinhDiem() {
        return (this.toan * 2 + this.ly + this.hoa)/3;
    }

    @Override
    public String toString() {
        return "Diem trung binh mon chuyen toan cua hoc sinh nay la:" + tinhDiem();
    }
}