
package Controller;

import Entity.Oda;
import Service.OdaService;
import java.util.List;


public class OdaController {
    private OdaService odaService;

    public OdaController(OdaService odaService) {
        this.odaService = odaService;
    }

    public OdaController() {
    }
    
     public List<Oda> getAllOda(){
       
        return odaService.getAllOda();
    }
     
    public void sil(int id){
        
       odaService.sil(id);
    }
}
