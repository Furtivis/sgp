
package sgp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class UserList {
    
    Map<String, String> userlist = new HashMap<String, String>();
    Properties properties = new Properties();
    public UserList(){
        
        userlist.put("ThomasT", "admin1");
        userlist.put("WaylonW", "admin2");
        userlist.put("ElisaJ", "admin3");
        userlist.put("EricK", "admin4");
        
    }
    public String getUser(String username){
        return userlist.get(username);
    }
    public void setupUserList(){
        userlist = new HashMap<String, String>();
    }
    public Map<String, String> getUserList(){
        return userlist;
    }
    public void createNewUser(String un, String pw){
        userlist.put(un, pw);
    }
    public void saveUserlist() throws FileNotFoundException, IOException{
        for (Map.Entry<String,String> entry : userlist.entrySet()) {
             properties.put(entry.getKey(), entry.getValue());
        }
        properties.store(new FileOutputStream("data.properties"), null);
    }
    public void loadUserlist() throws FileNotFoundException, IOException{
        properties.load(new FileInputStream("data.properties"));

        for (String key : properties.stringPropertyNames()) {
            userlist.put(key, properties.get(key).toString());
        }
    }
    
}

