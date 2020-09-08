package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    // Parts
    private static final ObservableList<Part> parts = FXCollections.observableArrayList();
    public static void addPart(Part part) {
        parts.add(part);
    }
    public static ObservableList<Part> getParts() {
        return parts;
    }

    private static ObservableList<Part> filteredParts = FXCollections.observableArrayList();
    public static void addFilteredPart(Part part) {
        filteredParts.add(part);
    }
    public static ObservableList<Part> getFilteredParts() {
        return filteredParts;
    }


    // Products
    private static final ObservableList<Product> products = FXCollections.observableArrayList();
    public static void addProduct(Product product) {
        products.add(product);
    }
    public static ObservableList<Product> getProducts() { return products; }

    private static final ObservableList<Product> filteredProducts = FXCollections.observableArrayList();
    public static void addFilteredProduct(Product product) {
        filteredProducts.add(product);
    }
    public static ObservableList<Product> getFilteredProducts() { return filteredProducts; }
}
