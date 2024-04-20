/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.Abstratcts;

import Entity.Bashekim;
import java.util.List;

/**
 *
 * @author ZAY MOTORS
 */
public interface IBashekimService {
    public void Tedavi();
    public List<Bashekim> getAllBashekim();
    public void sil(int bashekim_id);
    
    
}
