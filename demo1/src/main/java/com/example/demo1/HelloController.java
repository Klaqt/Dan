package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button authorButton;
    @FXML
    void setAuthorButton () {
        new JOptionPane();
        JOptionPane.showMessageDialog(null, "Автор: Я; Группа: ИСП-41");
    }

    @FXML
    private Button exitButton;
    @FXML
    void setExitButton () {
        System.exit(0);
    }

    @FXML
    private Button helpButton;

    @FXML
    private Button windowButton;
    @FXML
    void setWindowButton () throws IOException {
        new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage stage = (Stage) windowButton.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("window.fxml"));
        Scene scene = new Scene(fxmlLoader1.load(), 399, 98);
        Stage stage1 = new Stage();
        stage1.setTitle("Окно");
        stage1.setScene(scene);
        stage1.show();
    }

    @FXML
    void setHelpButton() {
        new JOptionPane();
        JOptionPane.showMessageDialog(null, "Ладно");
    }

    @FXML
    void initialize() {
        assert authorButton != null : "fx:id=\"authorButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert helpButton != null : "fx:id=\"helpButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert windowButton != null : "fx:id=\"windowButton\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
