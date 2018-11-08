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
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FXMLSGPLoginController extends NavigationCntl implements Initializable {
    
    public FXMLSGPLoginController(){
        
    }
    
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        //Verifies credentials and transitions to MainDashboard if valid login.
        if(autheticate(username, password)){
            this.setCurrentUser(username);
            Stage stage = (Stage) actiontarget.getScene().getWindow();
            stage.hide();
            this.changeSceneMainDashboard(stage);
        }
        if(autheticate(username, password) == false){
            actiontarget.setText("Invalid Login");
            
        }
    }
    
    @FXML protected void handleCreateButtonAction(ActionEvent event) throws IOException {
        
        //Takes user to create new user scene.
        Stage stage = (Stage) actiontarget.getScene().getWindow();
        stage.hide();
        this.changeSceneCreateUser(stage);
    }
    
    //Autheticates user using UserList created above.
    public boolean autheticate(String username,String password) {
        try{
            return this.getUserList().getUser(username).equals(password);
        }
        catch(NullPointerException n){
            return false;
        }
    }  
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
