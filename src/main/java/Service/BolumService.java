
package Service;

import DAO.BolumDAO;
import Entity.Bolum;
import Service.Abstratcts.IBolumService;
import java.util.List;


public class BolumService implements IBolumService{
    
    private BolumDAO bolumDAO;

    public BolumService() {
    }

    public BolumService(BolumDAO bolumDAO) {
        this.bolumDAO = bolumDAO;
    }
    

    @Override
    public String bolum_seç(int doktor_id,int bolum_id) {
        return doktor_id + "'li doktor" + bolum_id +"2li bölümü seçti";
    }

    @Override
    public List<Bolum> getAllBolum() {
         return bolumDAO.getAllBolum();
    }

    @Override
    public void sil(int bolum_id) {
    }

   
}
