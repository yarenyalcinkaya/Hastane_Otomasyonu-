
package Service;

import DAO.MuayeneDAO;
import Entity.Muayene;
import Service.Abstratcts.IMuayeneService;
import java.util.List;


public class MuayeneService implements IMuayeneService{
    private MuayeneDAO muayeneDAO;

    public MuayeneService() {
    }

    public MuayeneService(MuayeneDAO muayeneDAO) {
        this.muayeneDAO = muayeneDAO;
    }
    

    @Override
    public String muayene_ol() {
        return "Hasta muayene oldu";
    }

    @Override
    public String muayene_et(int doktor_id) {
        return doktor_id + "'li doktor muayene etti";
    }

    @Override
    public List<Muayene> getAllMuayene() {
       return muayeneDAO.getAllMuayene();
    }

    @Override
    public void sil(int muayene_id) {
    }
    
}
