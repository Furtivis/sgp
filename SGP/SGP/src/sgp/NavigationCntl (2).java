/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author thoma
 */
public class NavigationCntl {
    public static final UserList userlist = new UserList();
    public static String currentUser;
    
    public NavigationCntl(){
        
    }
    public void changeSceneMainDashboard(Stage stage) throws IOException{
        Scene mainDash = new Scene(FXMLLoader.load(getClass().getResource("FXMLSGPMainDash.fxml")), 450, 525);
        stage.setScene(mainDash);
        stage.show();
    }
    public void changeSceneCreateUser(Stage stage) throws IOException{
        Scene createUser = new Scene(FXMLLoader.load(getClass().getResource("FXMLSGPCreateUser.fxml")), 350, 275);
        stage.setScene(createUser);
        stage.show();
    }
    public UserList getUserList(){
        return userlist;
    }
    public void setCurrentUser(String user){
        currentUser = user;
    }
    public String getCurrentUser(){
        return currentUser;
    }
}
