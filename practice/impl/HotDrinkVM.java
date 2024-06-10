package practice.impl;

import practice.Product;
import practice.VendingMachine;

import java.util.List;

public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}