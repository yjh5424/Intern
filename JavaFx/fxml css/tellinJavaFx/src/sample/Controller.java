package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {
    @FXML
    ImageView logo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FileInputStream input = new FileInputStream("src/image/ic_tellin.png");
            Image image = new Image(input);
            logo.setImage(image);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
