package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Inventory;
import model.Part;
import model.Product;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuCtrl implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resetPartsTable();
//        part_table.getSelectionModel().select(selectPart(1));
        resetProductsTable();
    }

    // Exit Application Button
    @FXML
    private Button exit;

    // Parts Table UI
    @FXML
    private TextField search_parts;
    @FXML
    private TableView<Part> parts_table;
    @FXML
    private TableColumn<Part, Integer> part_id;
    @FXML
    private TableColumn<Part, String> part_name;
    @FXML
    private TableColumn<Part, Integer> part_inventory;
    @FXML
    private TableColumn<Part, Double> part_unit;
    @FXML
    private Button add_part, modify_part, delete_part;

    // Products Table UI
    @FXML
    private TextField search_products;
    @FXML
    private TableView<Product> products_table;
    @FXML
    private TableColumn<Product, Integer> product_id;
    @FXML
    private TableColumn<Product, String> product_name;
    @FXML
    private TableColumn<Product, Integer> product_inventory;
    @FXML
    private TableColumn<Product, Double> product_unit;
    @FXML
    private Button add_product, modify_product, delete_product;

    // Exit Application Function
    @FXML
    void exit(ActionEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }

    // Parts Table Functions
    @FXML
    void searchParts(ActionEvent event) {
        if (search_parts.getText().isBlank()) {
            resetPartsTable();
        }

        else {

            if (!(Inventory.getFilteredParts().isEmpty())) {
                Inventory.getFilteredParts().clear();
            }
            for (Part part : Inventory.getParts()) {
                if (part.getName().contains(search_parts.getText())) {
                    Inventory.getFilteredParts().add(part);
                }
            }
            for (Part part : Inventory.getParts()) {
                if (Integer.toString(part.getId()).contains(search_parts.getText())) {
                    Inventory.getFilteredParts().add(part);
                }
            }
            filterPartsTable();
        }
    }
    private void resetPartsTable() {
        parts_table.setItems(Inventory.getParts());
        part_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        part_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        part_inventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        part_unit.setCellValueFactory(new PropertyValueFactory<>("price"));
    }
    private void filterPartsTable() {
        parts_table.setItems(Inventory.getFilteredParts());
        part_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        part_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        part_inventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        part_unit.setCellValueFactory(new PropertyValueFactory<>("price"));
    }
    
    @FXML
    void addPart(ActionEvent event) throws IOException {
        Parent part_add_root = FXMLLoader.load(getClass().getResource("../view/part_add.fxml"));
        Stage part_add_stage = new Stage();
        part_add_stage.setScene(new Scene(part_add_root));
        part_add_stage.initModality(Modality.APPLICATION_MODAL);
        part_add_stage.show();

        PartAddCtrl partAddCtrl = new PartAddCtrl();
    }
    @FXML
    void modifyPart(ActionEvent event) throws IOException {
        Parent part_modify_root = FXMLLoader.load(getClass().getResource("../view/part_modify.fxml"));
        Stage part_modify_stage = new Stage();
        part_modify_stage.setScene(new Scene(part_modify_root));
        part_modify_stage.initModality(Modality.APPLICATION_MODAL);
        part_modify_stage.show();
    }
    @FXML
    void deletePart(ActionEvent event) {

    }
/*
    public Part selectPart(int id) {
        for(Part part : Inventory.getParts()) {
            if (part.getId() == id) {
                return part;
            }
        }
        return null;
    }
*/

    // Products Table Functions

    @FXML
    void searchProducts(ActionEvent event) {
        if (search_products.getText().isBlank()) {
            resetProductsTable();
        }

        else {

            if (!(Inventory.getFilteredProducts().isEmpty())) {
                Inventory.getFilteredProducts().clear();
            }
            for (Product product : Inventory.getProducts()) {
                if (product.getName().contains(search_products.getText())) {
                    Inventory.getFilteredProducts().add(product);
                }
            }
            for (Product product : Inventory.getProducts()) {
                if (Integer.toString(product.getId()).contains(search_products.getText())) {
                    Inventory.getFilteredProducts().add(product);
                }
            }
            filterProductsTable();
        }
    }
    private void resetProductsTable() {
        products_table.setItems(Inventory.getProducts());
        product_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        product_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        product_inventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        product_unit.setCellValueFactory(new PropertyValueFactory<>("price"));
    }
    private void filterProductsTable() {
        products_table.setItems(Inventory.getFilteredProducts());
        product_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        product_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        product_inventory.setCellValueFactory(new PropertyValueFactory<>("stock"));
        product_unit.setCellValueFactory(new PropertyValueFactory<>("price"));
    }
    
    @FXML
    void addProduct(ActionEvent event) throws IOException {
        Parent product_add_root = FXMLLoader.load(getClass().getResource("../view/product_add.fxml"));
        Stage product_add_stage = new Stage();
        product_add_stage.setScene(new Scene(product_add_root));
        product_add_stage.initModality(Modality.APPLICATION_MODAL);
        product_add_stage.show();
    }
    @FXML
    void modifyProduct(ActionEvent event) throws IOException {
        Parent product_modify_root = FXMLLoader.load(getClass().getResource("../view/product_modify.fxml"));
        Stage product_modify_stage = new Stage();
        product_modify_stage.setScene(new Scene(product_modify_root));
        product_modify_stage.initModality(Modality.APPLICATION_MODAL);
        product_modify_stage.show();
    }
    @FXML
    void deleteProduct(ActionEvent event) {
    }
}
