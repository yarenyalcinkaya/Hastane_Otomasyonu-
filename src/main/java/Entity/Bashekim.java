package Entity;

import java.util.List;


public class Bashekim   {
    private int bashekim_id;
    private String ad;
    private String soyad;
    private String unvan;
    
    //OneToOne
    private Bolum bolum;
    
    
    //OneToMany
    private List<Doktor> doktorlar;
    
    
    public Bashekim() {
    }

    public Bashekim(int bashekim_id, String ad, String soyad, String unvan) {
        this.bashekim_id = bashekim_id;
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
    }

    public Bashekim(int bashekim_id) {
        this.bashekim_id = bashekim_id;
    }

    public Bashekim(int bashekim_id, String ad, String soyad, String unvan, Bolum bolum) {
        this.bashekim_id = bashekim_id;
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.bolum = bolum;
    }

    public int getBashekim_id() {
        return bashekim_id;
    }

    public void setBashekim_id(int bashekim_id) {
        this.bashekim_id = bashekim_id;
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

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    
    

    
}


