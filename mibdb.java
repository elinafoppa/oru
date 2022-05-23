package mibd;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author ASUS
 */
public class mibdb {
    
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
    
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
       
                    
        }catch (InfException ex) {
            Logger.getLogger(mibdb.class.getName()).log(Level.SEVERE, null, ex);
        }
                }        
        
}
