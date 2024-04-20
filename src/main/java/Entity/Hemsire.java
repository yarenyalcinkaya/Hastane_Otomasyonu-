package Entity;


public class Hemsire {
    private int hemsire_id;
    private String ad;
    private String soyad;

    public Hemsire() {
    }

    public Hemsire(int hemsire_id, String ad, String soyad) {
        this.hemsire_id = hemsire_id;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getHemsire_id() {
        return hemsire_id;
    }

    public void setHemsire_id(int hemsire_id) {
        this.hemsire_id = hemsire_id;
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
