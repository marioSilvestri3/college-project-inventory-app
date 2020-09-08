package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Inventory;
import model.PartInhouse;
import model.PartOutsourced;
import model.Product;

/** Creates a desktop application that manages part and product inventory */
public class Main extends Application {

    @Override
    public void start(Stage main_menu) throws Exception {
        Parent main_menu_root = FXMLLoader.load(getClass().getResource("../view/main_menu.fxml"));
        main_menu.setTitle("Mario Silvestri - C482 - Inventory");
        main_menu.setScene(new Scene(main_menu_root));
        main_menu.show();
    }

    public static void main(String[] args) {

        PartOutsourced screw = new PartOutsourced(1, "Screw", .01, 1000, 100, 100000, "Acme");

        PartInhouse widget = new PartInhouse(2, "Widget",1.00, 100, 10, 1000, 1);

        Product contraption = new Product(1,"Contraption", 1000,10,2,25);

        Inventory.addPart(screw); Inventory.addPart(widget);

        Inventory.addProduct(contraption);

        Application.launch(args);
    }
}
