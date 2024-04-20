
package Controller;

import Entity.Randevu;
import Service.RandevuService;
import java.util.List;


public class RandevuController {
    private RandevuService randevuService;

    public RandevuController(RandevuService randevuService) {
        this.randevuService = randevuService;
    }

    public RandevuController() {
    }
    
     public List<Randevu> getAllRandevu(){
       
        return randevuService.getAllRandevu();
    }
     
    public void sil(int id){
        
       randevuService.sil(id);
    }
}
