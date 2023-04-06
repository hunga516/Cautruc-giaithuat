package doanOfficial;

public class TuiXach {
    private String name;
    private double price;
    private String style;

    public TuiXach(String name, double price, String style) {
        this.name = name;
        this.price = price;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }
}
