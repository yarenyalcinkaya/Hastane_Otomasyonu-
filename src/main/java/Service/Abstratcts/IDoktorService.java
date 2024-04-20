
package Service.Abstratcts;

import Entity.Doktor;
import java.util.List;


public interface IDoktorService {
 

    public void Tedavi();
    public List<Doktor> getAllDoktor();
    public void sil(int doktor_idid);
    
    
    
}
