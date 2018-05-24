package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private Pane mainPane;

    @FXML
    void initialize() {
        mainPane.setStyle("-fx-background-color: red;");
        System.out.println("initialize");
    }

}
