
package Service.Abstratcts;

import Entity.Randevu;
import java.util.Date;
import java.util.List;


public interface IRandevuService {
    public boolean tarihKontrol(Date tarih);
    public boolean randevuKontrol(int randevu_no);
    public List<Randevu> getAllRandevu();
    public void sil(int id);
}
