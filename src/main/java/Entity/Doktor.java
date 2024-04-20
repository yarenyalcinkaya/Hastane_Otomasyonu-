/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.List;

/**
 *
 * @author ZAY MOTORS
 */
public class Doktor {
    
     private int doktor_id;
    private String ad;
    private String soyad;
    private String unvan;
    
    //ManyToONe
    private Bolum bolum;
    
    //ManyToOne
    private Bashekim bashekim;
    
    //OneToMany
    private List<Muayene> muayeneler;
    
    //OneToMany
    private List<Randevu> randevular;

    public Doktor() {
    }

    public Doktor(int doktor_id, String ad, String soyad, String unvan) {
        this.doktor_id = doktor_id;
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
    }

    public Doktor(int doktor_id, String ad, String soyad, String unvan, Bolum bolum, Bashekim bashekim) {
        this.doktor_id = doktor_id;
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.bolum = bolum;
        this.bashekim = bashekim;
    }
    
    
    
    
    
    
    

    public int getDoktor_id() {
        return doktor_id;
    }

    public void setDoktor_id(int doktor_id) {
        this.doktor_id = doktor_id;
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

    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

    public Bashekim getBashekim() {
        return bashekim;
    }

    public void setBashekim(Bashekim bashekim) {
        this.bashekim = bashekim;
    }

    public List<Muayene> getMuayeneler() {
        return muayeneler;
    }

    public void setMuayeneler(List<Muayene> muayeneler) {
        this.muayeneler = muayeneler;
    }

    public List<Randevu> getRandevular() {
        return randevular;
    }

    public void setRandevular(List<Randevu> randevular) {
        this.randevular = randevular;
    }


    
    
    
    
    
}
