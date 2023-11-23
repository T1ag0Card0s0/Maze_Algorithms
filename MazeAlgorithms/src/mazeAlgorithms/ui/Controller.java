package mazeAlgorithms.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller {
    private Object userData;

    @FXML
    private Label label;
    @FXML
    private StackPane stackPane;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Stage stage = (Stage) stackPane.getScene().getWindow();
        this.userData=stage.getUserData();
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }
}
