
package Controller;

import Entity.Bashekim;
import Service.BashekimService;
import java.util.List;


public class BashekimController {
    private BashekimService bashekimService;

    public BashekimController(BashekimService bashekimService) {
        this.bashekimService = bashekimService;
    }

    public BashekimController() {
    }
    
     public List<Bashekim> getAllBashekim(){
       
        return bashekimService.getAllBashekim();
    }
     
    public void sil(int id){
        
       bashekimService.sil(id);
    }
}
