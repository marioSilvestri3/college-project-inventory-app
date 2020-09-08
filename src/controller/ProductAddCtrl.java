package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class ProductAddCtrl {

    @FXML
    private TextArea search;

    // Parts Catalogue Table
    @FXML
    private TableView<?> catalogue_table;
    @FXML
    private TableColumn<?, ?> catalogue_id;
    @FXML
    private TableColumn<?, ?> catalogue_name;
    @FXML
    private TableColumn<?, ?> catalogue_inventory;
    @FXML
    private TableColumn<?, ?> catalogue_unit;
    @FXML
    private Button add_part;

    // Associated Parts Table
    @FXML
    private TableView<?> associated_table;
    @FXML
    private TableColumn<?, ?> associated_id;
    @FXML
    private TableColumn<?, ?> associated_name;
    @FXML
    private TableColumn<?, ?> associated_inventory;
    @FXML
    private TableColumn<?, ?> associated_unit;
    @FXML
    private Button remove_part;

    @FXML
    private TextField name;
    @FXML
    private TextField inventory;
    @FXML
    private TextField unit;
    @FXML
    private TextField max;
    @FXML
    private TextField min;

    @FXML
    private Button save, cancel;

    @FXML
    void addAssociatedPart(ActionEvent event) {

    }

    @FXML
    void cancelAddProduct(ActionEvent event) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void removeAssociatedPart(ActionEvent event) {

    }

    @FXML
    void saveProduct(ActionEvent event) {

    }

    @FXML
    void searchTable(KeyEvent event) {

    }
}
