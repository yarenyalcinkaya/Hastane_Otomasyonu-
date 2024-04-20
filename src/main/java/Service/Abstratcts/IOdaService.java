
package Service.Abstratcts;

import Entity.Oda;
import java.util.List;


public interface IOdaService {
    
    public boolean odaKontrol(int oda_id);
    public List<Oda> getAllOda();
    public void sil(int id);
    
}
