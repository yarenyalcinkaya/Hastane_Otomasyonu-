package Entity;

import java.util.List;


public class Hasta {
    private int hasta_id;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private int yaş;
    
    //ManyToOne
    private Oda oda;
    
    
    //OneToMany
    private List<Muayene> muayaneler;
    
    //OneToMany
    private List<Randevu> randevular;

    public Hasta() {
    }

    public Hasta(int hasta_id, String ad, String soyad, String cinsiyet, int yaş) {
        this.hasta_id = hasta_id;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.yaş = yaş;
    }

    public int getHasta_id() {
        return hasta_id;
    }

    public void setHasta_id(int hasta_id) {
        this.hasta_id = hasta_id;
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

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }
  
    
}
