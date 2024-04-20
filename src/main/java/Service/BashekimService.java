
package Service;

import DAO.BashekimDAO;
import Entity.Bashekim;
import Service.Abstratcts.IBashekimService;
import java.util.List;


public class BashekimService implements IBashekimService{
    
   private BashekimDAO bashekimDAO;

    public BashekimService() {
    }

    public BashekimService(BashekimDAO bashekimDAO) {
        this.bashekimDAO = bashekimDAO;
    }
   

    
    public void Tedavi() {
        System.out.println("basheim tedavi etti ");
    }

 
    @Override
    public List<Bashekim> getAllBashekim() {
       return bashekimDAO.getAllBashekim();
    }
    @Override
    public void sil(int bashekim_id) {

    }
    
    
    
}
