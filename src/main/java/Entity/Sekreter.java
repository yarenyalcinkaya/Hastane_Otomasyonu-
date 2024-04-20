package Entity;

import java.util.List;


public class Sekreter {
    private int sekreter_id;
    private String ad;
    private String soyad;
    
    
    
   
    //OneToMany
    private List<Randevu> randevular;
    
    
    

    public Sekreter() {
    }

    public Sekreter(int sekreter_id, String ad, String soyad) {
        this.sekreter_id = sekreter_id;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getSekreter_id() {
        return sekreter_id;
    }

    public void setSekreter_id(int sekreter_id) {
        this.sekreter_id = sekreter_id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
