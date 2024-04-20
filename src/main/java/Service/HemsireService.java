
package Service;

import DAO.HemsireDAO;
import Entity.Hemsire;
import Service.Abstratcts.IHemsireService;
import java.util.List;

public class HemsireService implements IHemsireService{
    
    private HemsireDAO hemsireDAO;

    public HemsireService() {
    }

    public HemsireService(HemsireDAO hemsireDAO) {
        this.hemsireDAO = hemsireDAO;
    }
    

    @Override
    public void tedaviUygula() {
    }

    @Override
    public boolean hastaKontrol(int hasta_id) {
        return false;
    }

    @Override
    public List<Hemsire> getAllHemsire() {
        return hemsireDAO.getAllHemsire();
    }

    @Override
    public void sil(int hemsire_id) {
    }
    
}
