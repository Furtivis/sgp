/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FXMLSGPCreateUserController extends FXMLSGPLoginController implements Initializable{
    
    public FXMLSGPCreateUserController() throws IOException{
       super();
    }
    
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML protected void handleCreateButtonAction(ActionEvent event) throws IOException {
        
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println(username + password);
        //Creates new user in userlist.
        this.getUserList().createNewUser(username, password);
        this.getUserList().saveUserlist();
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        Scene login = new Scene(FXMLLoader.load(getClass().getResource("FXMLSGPLogin.fxml")), 350, 275);
        stage.setScene(login);
        stage.show();
    }
     @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        Scene login = new Scene(FXMLLoader.load(getClass().getResource("FXMLSGPLogin.fxml")), 350, 275);
        stage.setScene(login);
        stage.show();
    }
       
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}

