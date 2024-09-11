package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class window {

    @FXML
    private Button buttonBack;
    @FXML
    void setButtonBack () throws IOException {
        new FXMLLoader(HelloApplication.class.getResource("window.fxml"));
        Stage stage = (Stage) buttonBack.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader1.load(), 269, 238);
        Stage stage1 = new Stage();
        stage1.setTitle("Программа");
        stage1.setScene(scene);
        stage1.show();
    }

    @FXML
    void initialize() {
        assert buttonBack != null : "fx:id=\"buttonBack\" was not injected: check your FXML file 'window.fxml'.";

    }

}
