package lk.mrr.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class OrderListFormController {
    public Button backToHome;
    public AnchorPane contextOfOrderListForm;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) contextOfOrderListForm.getScene().getWindow();
        URL resource = getClass().getResource("../view/HomeForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);

        stage.setTitle("Home Form");
        stage.setScene(scene);
        stage.centerOnScreen();
    }
}
