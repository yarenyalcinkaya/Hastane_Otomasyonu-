
package Service.Abstratcts;

import Entity.Hasta;
import java.util.List;


public interface IHastaService {
    
    void randevuAl();
    void doktorSeç();
    public List<Hasta> getAllHasta();
    public void sil(int id);
}
