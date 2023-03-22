public class NhanVienPartTime extends NhanVien {
    private int timeOfwork;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String name, long salary, int timeOfwork) {
        super(name, salary);
        this.timeOfwork = timeOfwork;
    }

    public void setTimeOfwork(int timeOfwork) {
        this.timeOfwork = timeOfwork;
    }

    public int getTimeOfwork() {
        return this.timeOfwork;
    }

    @Override
    public String loaiNhanVien() {
        return ("PartTime");
    }

    @Override
    public void tinhLuong() {
        //
    }

}