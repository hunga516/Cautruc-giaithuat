package doanOfficial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TuiXach> handbags;
    private ArrayList<LoaiTuiSach> bagTypes;

    public QuanLy() {
        this.handbags = new ArrayList<>();
        this.bagTypes = new ArrayList<>();
    }

    public void addHandbag(TuiXach handbag) {
        handbags.add(handbag);
    }

    public void removeHandbag(TuiXach handbag) {
        handbags.remove(handbag);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (TuiXach handbag : handbags) {
            totalValue += handbag.getPrice();
        }
        return totalValue;
    }

    public void addBagType() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bag type details:");
        System.out.print("Type ID: ");
        int typeId = scanner.nextInt();
        scanner.nextLine(); // consume \n character
        System.out.print("Type Name: ");
        String typeName = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        LoaiTuiSach bagType = new LoaiTuiSach(typeId, typeName, description, price);
        bagTypes.add(bagType);

    }

}
