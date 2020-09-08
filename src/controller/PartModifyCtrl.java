package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PartModifyCtrl {

    @FXML
    private ToggleGroup type;
    @FXML
    private RadioButton inhouse, outsourced;

    @FXML
    private TextArea id, name, inventory, unit, machineId, min, max, company;

    @FXML
    private Button save, cancel;

    @FXML
    void selectInhouse(ActionEvent event) {

    }
    @FXML
    void selectOutsourced(ActionEvent event) {

    }

    @FXML
    void savePart(ActionEvent event) {

    }
    @FXML
    void cancelPart(ActionEvent event) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }

}
