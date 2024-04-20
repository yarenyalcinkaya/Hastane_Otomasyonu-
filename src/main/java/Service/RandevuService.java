
package Service;

import DAO.RandevuDAO;
import Entity.Randevu;
import Service.Abstratcts.IRandevuService;
import java.util.Date;
import java.util.List;


public class RandevuService implements IRandevuService{
    private RandevuDAO randevuDAO;

    public RandevuService() {
    }

    public RandevuService(RandevuDAO randevuDAO) {
        this.randevuDAO = randevuDAO;
    }
    

    @Override
    public boolean tarihKontrol(Date tarih) {
        return false;
    }

    @Override
    public boolean randevuKontrol(int randevu_no) {
       return false;
    }

    @Override
    public List<Randevu> getAllRandevu() {
        return randevuDAO.getAllRandevu();
    }

    @Override
    public void sil(int id) {
    }
    
}
