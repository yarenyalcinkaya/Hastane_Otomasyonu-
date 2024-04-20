
package Controller;

import Entity.Hemsire;
import Service.HemsireService;
import java.util.List;


public class HemsireController {
    private HemsireService hemsireService;

    public HemsireController(HemsireService hemsireService) {
        this.hemsireService = hemsireService;
    }

    public HemsireController() {
    }
    
     public List<Hemsire> getAllHemsire(){
       
        return hemsireService.getAllHemsire();
    }
     
    public void sil(int id){
        
       hemsireService.sil(id);
    }
}
