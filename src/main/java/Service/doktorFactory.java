
package Service;

import Entity.AileHekimi;
import Entity.Dermotolog;
import Entity.Doktor;
import Entity.KadınDoğumveHastalıkları;
import Entity.Kardiyolog;

public class doktorFactory {
    
    
    
    public  static Doktor create(String tip,int doktor_id, String ad, String soyad, String unvan){
         Doktor d=null;

        if(tip.equals("dermatolog")){
            d = new Dermotolog(doktor_id,ad,soyad,unvan);
            return d;
        }
        else if(tip.equals("kardiyolog")){
            d = new Kardiyolog(doktor_id,ad,soyad,unvan);
          return d;
          
        }else if(tip.equals("Aile Hekimi")){
            d = new AileHekimi(doktor_id,ad,soyad,unvan);
            return d;
            
        }else if(tip.equals("Kadın Doğum ve Hastalıkları")){
            d = new KadınDoğumveHastalıkları(doktor_id, ad, soyad, unvan);
            return d;
        }
        
        
        
        return d;
   
    }
    
}
