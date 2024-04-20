
package Service;

import DAO.OdaDAO;
import Entity.Oda;
import Service.Abstratcts.IOdaService;
import java.util.List;

public class OdaService implements IOdaService{
    private OdaDAO odaDAO;
    private int kontrol;

    public OdaService() {
    }

    public OdaService(OdaDAO odaDAO, int kontrol) {
        this.odaDAO = odaDAO;
        this.kontrol = kontrol;
    }
    

    @Override
    public boolean odaKontrol(int oda_id) {
     if(kontrol==oda_id){
         return true;
     }else{
         return false;
     }
     
    }

    @Override
    public List<Oda> getAllOda() {
        return odaDAO.getAllOda();
    }

    @Override
    public void sil(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
