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
        try {
            Parent root = FXMLLoader.load(getClass().getResource("views/Scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setUserData(scene);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop(){

    }
}

