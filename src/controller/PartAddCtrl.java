package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Inventory;
import model.PartInhouse;

public class PartAddCtrl {

    @FXML
    private ToggleGroup type;
    @FXML
    private RadioButton inhouse, outsourced;

    @FXML
    private TextArea id, name, inventory, unit, min, max, machine_id;

    @FXML
    private Label machine_id_label;

    @FXML
    private Button save, cancel;

    @FXML
    void selectInhouse(ActionEvent event) {
        machine_id_label.setText("Machine ID");

    }
    @FXML
    void selectOutsourced(ActionEvent event) {
        machine_id_label.setText("Company");
    }

    @FXML
    void savePart(ActionEvent event) {
        boolean isInhouse = inhouse.isSelected();

        int part_id = Integer.parseInt(id.getText());
        String part_name = name.getText();
        int part_inventory = Integer.parseInt(inventory.getText());
        double part_unit = Double.parseDouble(unit.getText());
        int part_machineID = Integer.parseInt(machine_id.getText());
        int part_min = Integer.parseInt(min.getText());
        int part_max = Integer.parseInt(max.getText());
        String part_company = name.getText();

        Inventory.addPart(new PartInhouse(part_id, part_name, part_unit, part_inventory, part_min, part_max, part_machineID));

        Stage stage = (Stage) save.getScene().getWindow();
        stage.close();

    }
    @FXML
    void cancelPart(ActionEvent event) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }
}
