
package Service.Abstratcts;


import Entity.Bolum;
import java.util.List;


public interface IBolumService {
    
    public String bolum_seç(int doktor_id,int bolum_id);
     public List<Bolum> getAllBolum();
    public void sil(int bolum_id);
}
