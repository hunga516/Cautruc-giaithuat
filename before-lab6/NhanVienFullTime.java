public class NhanVienFullTime extends NhanVien {
    private String position;
    private int dateOfwork;

    public NhanVienFullTime(String name, long salary, String position, int dateOfwork) {
        super(name, salary);
        this.position = position;
        this.dateOfwork = dateOfwork;
    }

    public NhanVienFullTime() {
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setDateOfwork(int dateOfwork) {
        this.dateOfwork = dateOfwork;
    }

    public int getDateOfwork() {
        return this.dateOfwork;
    }

    @Override
    public String loaiNhanVien() {
        return ("Fulltime");
    }

    @Override
    public void tinhLuong() {
        //
    }
}