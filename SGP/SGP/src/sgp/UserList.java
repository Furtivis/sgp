
package sgp;

import java.util.HashMap;
import java.util.Map;


public class UserList {
    
    Map<String, String> userlist = new HashMap<String, String>();
    
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
    
}
