package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.net.URL;

public class Main extends Application {
        public static final Stage window = new Stage();


    @Override
        public void start(Stage primaryStage) throws Exception{

            Parent root = FXMLLoader.load(getClass().getResource("fxml/css_style.fxml"));
            Scene scene = new Scene(root, 700, 500);
            scene.getStylesheets().add(getClass().getResource("css/css_style.css").toExternalForm());
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        window.setX(bounds.getMinX());
        window.setY(bounds.getMinY());
        window.setWidth(bounds.getWidth());
        window.setHeight(bounds.getHeight());


            window.initStyle(StageStyle.TRANSPARENT);
            window.getIcons().add(new Image("img/icon.png"));
            window.setScene(scene);
            window.show();


        }

    public static void main(String[] args) {
        launch(args);
    }

}
