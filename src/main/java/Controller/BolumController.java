
package Controller;

import Entity.Bolum;
import Service.BolumService;
import java.util.List;

public class BolumController {
    private BolumService bolumService;

    public BolumController(BolumService bolumService) {
        this.bolumService = bolumService;
    }

    public BolumController() {
    }
    
     public List<Bolum> getAllBolum(){
       
        return bolumService.getAllBolum();
    }
     
    public void sil(int id){
        
       bolumService.sil(id);
    }
}
