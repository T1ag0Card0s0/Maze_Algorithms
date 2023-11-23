package mazeAlgorithms.ui;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFX extends Application {
   
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root, 700, 300));
        stage.show();
    }

    @Override
    public void stop(){

    }
}

