import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URI;


public class guiMain extends Application {
    URLRandomizer urlRandomizer = new URLRandomizer();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        Button button = new Button("Click Me");

        button.setOnAction(event -> {
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(urlRandomizer.UrlMaker());
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        vBox.getChildren().add(button);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(100));

        Scene scene = new Scene(vBox, 400, 250);

        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
