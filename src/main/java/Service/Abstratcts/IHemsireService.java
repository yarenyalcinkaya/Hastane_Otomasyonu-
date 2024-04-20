
package Service.Abstratcts;

import Entity.Hemsire;
import java.util.List;


public interface IHemsireService {
    
    void tedaviUygula();
    boolean hastaKontrol(int hasta_id);
    public List<Hemsire> getAllHemsire();
    public void sil(int hemsire_id);
}
