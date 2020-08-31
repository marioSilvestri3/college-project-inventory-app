package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuCtrl {

    @FXML
    private Button main_exit;

    @FXML
    public void main_exit(ActionEvent event) {
        Stage stage = (Stage) main_exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Button main_add_part;

    @FXML
    private Button main_mod_part;

    @FXML
    private Button main_delete_part;

    @FXML
    private Button main_add_product;

    @FXML
    private Button main_modify_product;

    @FXML
    private Button main_delete_product;

    @FXML
    void main_add_part(ActionEvent event) {

    }

    @FXML
    void main_add_product(ActionEvent event) {

    }

    @FXML
    void main_delete_part(ActionEvent event) {

    }

    @FXML
    void main_delete_product(ActionEvent event) {

    }

    @FXML
    void main_modify_part(ActionEvent event) {

    }

    @FXML
    void main_modify_product(ActionEvent event) {

    }

}
