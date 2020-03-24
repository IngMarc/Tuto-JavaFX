/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LoginController implements Initializable {

    @FXML
    private TextField textLogin;
    @FXML
    private TextField textPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private Label errorText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource().equals(btnLogin)){
            String login=textLogin.getText();
            String pwd=textPassword.getText();
            
            if(login.equals("admin") && pwd.equals("root")){
                Stage primaryStage=new Stage();
                Parent root = FXMLLoader.load(getClass().getResource ("Dashboard.fxml"));
                Scene scene=new Scene(root); 
                primaryStage.setTitle("DashBoard");
                primaryStage.setScene(scene);
                primaryStage.show();
            }else{
                errorText.setText("Login ou mot de passe incorrect!");
            }
        }
    }
    
}
