
package sgp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SGP extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLSGPLogin.fxml"));
        
        Scene scene = new Scene(root, 350, 275);
        
        stage.setTitle("Smart Grade Predictor");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        
        
    }
    
    
    
    
}
