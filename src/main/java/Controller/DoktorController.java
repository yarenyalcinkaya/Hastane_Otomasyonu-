
package Controller;

import DAO.DoktorDAO;
import Entity.Doktor;
import Service.DoktorService;
import java.util.List;


public class DoktorController {
    
    private DoktorService doktorService;

    public DoktorController(DoktorService doktorService) {
        this.doktorService = doktorService;
    }

    public DoktorController() {
    }
    
     public List<Doktor> getAllDoktor(){
       
        return doktorService.getAllDoktor();
    }
     
    public void sil(int id){
        
       doktorService.sil(id);
    }
    
}
