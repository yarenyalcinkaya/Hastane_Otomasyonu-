
package Controller;

import Entity.Muayene;
import Service.MuayeneService;
import java.util.List;


public class MuayeneController {
    private MuayeneService muayeneService;

    public MuayeneController(MuayeneService muayeneService) {
        this.muayeneService = muayeneService;
    }

    public MuayeneController() {
    }
    
     public List<Muayene> getAllMuayene(){
       
        return muayeneService.getAllMuayene();
    }
     
    public void sil(int id){
        
       muayeneService.sil(id);
    }
}
