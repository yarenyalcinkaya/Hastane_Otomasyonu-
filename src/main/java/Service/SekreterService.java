
package Service;

import DAO.SekreterDAO;
import Entity.Sekreter;
import Service.Abstratcts.ISekreterService;
import java.util.List;


public class SekreterService implements ISekreterService {
    
    private SekreterDAO sekreterDAO;

    public SekreterService() {
    }

    public SekreterService(SekreterDAO sekreterDAO) {
        this.sekreterDAO = sekreterDAO;
    }
    

    @Override
    public void randevuVer() {
        System.out.println("Randevu verildi.");
    }

    @Override
    public List<Sekreter> getAllSekreter() {
        return sekreterDAO.getAllSekreter();
    }

    @Override
    public void sil(int id) {
    }
    
}
