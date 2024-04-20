

package Main;

import DAO.DoktorDAO;
import Entity.Bashekim;
import Entity.Bolum;
import Entity.Doktor;
import GUI.guı1;
import Service.doktorFactory;
import GUI.guı1;



public class HastaneOtomasyon {
    public static void main(String[] args) {
//         guı1 g = new guı1();
 //       g.setVisible(true);
        
        
        
        DoktorDAO dao = new DoktorDAO();
        
        dao.ekleDoktor(new Doktor(5, "yaren", "yalcinkaya", "prof",new Bolum(2, "dermatoloji"),new Bashekim(1)));
        
        
        
        
    }
  
}
