/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.DoktorDAO;
import Entity.Doktor;
import java.util.List;
import Service.Abstratcts.IDoktorService;


public class DoktorService implements IDoktorService{
    
   
   private DoktorDAO doktorDAO;

    public DoktorService() {
    }

    public DoktorService( DoktorDAO doktorDAO) {
       
        this.doktorDAO = doktorDAO;
    }

   @Override
    public void Tedavi() {
        
        //Tablolardan randevuyu sil


    }
    
    
   @Override
     public List<Doktor> getAllDoktor(){
        return doktorDAO.getAllDoktor();
    }
    
    
    
   @Override
    public void sil(int doktor_id){
        
        
    }
    
    
}
