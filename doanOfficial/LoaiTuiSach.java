package doanOfficial;

public class LoaiTuiSach {
    private int typeId;
    private String typeName;
    private String description;
    private double price;

    public LoaiTuiSach(int typeId, String typeName, String description, double price) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.price = price;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}