package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;


import java.io.File;
import java.util.ArrayList;

public class NewAddController {
    @FXML
    private TextField category;
    @FXML
    private TextField title;
    @FXML
    private TextField price;
    File file;
    ArrayList<String> addvertisment = new ArrayList<>();

    @FXML
    public void imageChooser(ActionEvent e) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", "*.jpg"));
        file = fileChooser.showOpenDialog(null);

    }

    @FXML
    private TextField contactInformation;

    @FXML
    private TextField Information;

    public void setAdd(ActionEvent event) {
        addvertisment.add(category.getText());
        addvertisment.add(title.getText());
        addvertisment.add(price.getText());
        addvertisment.add(contactInformation.getText());
        addvertisment.add(Information.getText());
        System.out.println(addvertisment);

    }

}
