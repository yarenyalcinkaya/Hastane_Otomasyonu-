
package Controller;

import Entity.Hasta;
import Service.HastaService;
import java.util.List;


public class HastaController {
    private HastaService hastaService;

    public HastaController(HastaService hastaService) {
        this.hastaService = hastaService;
    }

    public HastaController() {
    }
    
     public List<Hasta> getAllHasta(){
       
        return hastaService.getAllHasta();
    }
     
    public void sil(int id){
        
       hastaService.sil(id);
    }
}
