
package Service.Abstratcts;

import Entity.Sekreter;
import java.util.List;


public interface ISekreterService {
    public void randevuVer();
    public List<Sekreter> getAllSekreter();
    public void sil(int id);
}
