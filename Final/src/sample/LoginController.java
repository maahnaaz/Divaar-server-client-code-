package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField userNameText;
    @FXML
    private TextField passwordText;
    @FXML
    private Label Status;
    @FXML
    private ImageView boximage;
    public void login(ActionEvent e) throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MainCode.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void setSignUp(ActionEvent e) throws Exception{
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(root1);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
