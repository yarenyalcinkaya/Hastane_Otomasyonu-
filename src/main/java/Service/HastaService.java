
package Service;

import DAO.HastaDAO;
import Entity.Hasta;
import Service.Abstratcts.IHastaService;
import java.util.List;


public class HastaService implements IHastaService{
    
    private HastaDAO hastaDAO;

    public HastaService() {
    }

    public HastaService(HastaDAO hastaDAO) {
        this.hastaDAO = hastaDAO;
    }
    

    @Override
    public void randevuAl() {
    }

    @Override
    public void doktorSeç() {
    }

    @Override
    public List<Hasta> getAllHasta() {
        return hastaDAO.getAllHasta();
    }

    @Override
    public void sil(int hasta_id) {
    }

    
    
        

    }
    
    

