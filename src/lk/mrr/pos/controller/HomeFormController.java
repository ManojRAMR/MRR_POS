package lk.mrr.pos.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;

public class HomeFormController {
    public ImageView btnCustomer;
    public ImageView btnItem;
    public ImageView btnCart;
    public ImageView btnOrderList;

    public void btnCustomerOnClick(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("lk/mrr/pos/view/CustomerForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);

    }

    public void btnItemOnClick(MouseEvent mouseEvent) {
    }

    public void btnCartOnClick(MouseEvent mouseEvent) {
    }

    public void btnOrderListOnClick(MouseEvent mouseEvent) {
    }
}
