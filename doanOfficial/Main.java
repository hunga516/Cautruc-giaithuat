package doanOfficial;

public class Main {
    public static void main(String[] args) {
        // Tạo một số túi xách
        TuiXach handbag1 = new TuiXach("Handbag1", 100.0, "Style1");
        TuiXach handbag2 = new TuiXach("Handbag2", 200.0, "Style2");
        TuiXach handbag3 = new TuiXach("Handbag3", 300.0, "Style3");

        // Tạo một số loại túi xách
        LoaiTuiSach bagType1 = new LoaiTuiSach(1, "Type1", "Description1", 100.0);
        LoaiTuiSach bagType2 = new LoaiTuiSach(2, "Type2", "Description2", 200.0);
        LoaiTuiSach bagType3 = new LoaiTuiSach(3, "Type3", "Description3", 300.0);

        // Tạo đối tượng quản lý kho

        QuanLy manager = new QuanLy();

        manager.addBagType();

        // Tính tổng giá trị của tất cả các túi xách trong kho
        double totalValue = manager.getTotalValue();
        System.out.println("Total value of handbags: " + totalValue);

        // Xóa một túi xách khỏi kho
        manager.removeHandbag(handbag2);

        // Tính tổng giá trị còn lại của tất cả các túi xách trong kho
        totalValue = manager.getTotalValue();
        System.out.println("Total value of handbags: " + totalValue);
    }
}
