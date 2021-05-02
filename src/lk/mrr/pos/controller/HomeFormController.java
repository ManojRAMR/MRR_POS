package lk.mrr.pos.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomeFormController {
    public ImageView btnCustomer;
    public ImageView btnItem;
    public ImageView btnCart;
    public ImageView btnOrderList;
    public AnchorPane contextOfHomeForm;

    public void btnCustomerOnClick(MouseEvent mouseEvent) throws IOException {
        setUI("CustomerForm");
    }

    public void btnItemOnClick(MouseEvent mouseEvent) throws IOException {
        setUI("ItemForm");
    }

    public void btnCartOnClick(MouseEvent mouseEvent) throws IOException {
        setUI("CartForm");

    }

    public void btnOrderListOnClick(MouseEvent mouseEvent) throws IOException {
        setUI("OrderListForm");

    }

    public void setUI(String form) throws IOException {
        Stage stage = (Stage) contextOfHomeForm.getScene().getWindow();
        URL resource = getClass().getResource("../view/" + form + ".fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        stage.setTitle(form.toUpperCase() + " Form");
        stage.setScene(scene);

    }
}
