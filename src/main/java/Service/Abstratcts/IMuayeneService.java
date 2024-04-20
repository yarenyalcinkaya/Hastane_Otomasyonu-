
package Service.Abstratcts;

import Entity.Muayene;
import java.util.List;


public interface IMuayeneService {
    public String muayene_ol();
    public String muayene_et(int doktor_id);
    public List<Muayene> getAllMuayene();
    public void sil(int muayene_id);
}
