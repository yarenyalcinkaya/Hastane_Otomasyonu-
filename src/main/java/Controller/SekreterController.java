
package Controller;

import Entity.Sekreter;
import Service.SekreterService;
import java.util.List;


public class SekreterController {
private SekreterService sekreterService;

    public SekreterController(SekreterService sekreterService) {
        this.sekreterService = sekreterService;
    }

    public SekreterController() {
    }
    
     public List<Sekreter> getAllSekreter(){
       
        return sekreterService.getAllSekreter();
    }
     
    public void sil(int id){
        
       sekreterService.sil(id);
    }
}
