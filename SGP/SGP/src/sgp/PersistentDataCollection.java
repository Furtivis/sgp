/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp;
import java.io.*;
/**
 *
 * @author ezk5274
 */
public class PersistentDataCollection implements Serializable {
    private UserList userList;
    
    public PersistentDataCollection(){
        if(userList == null){
            userList = new UserList();
        }
    }
}
