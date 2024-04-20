package Entity;


import java.util.Date;


public class Randevu {
    private int randevu_id;
    private int randevu_no;
    private Date tarih;
    
    
    //OneToMany
    private Doktor doktor;
    
    //OneToMany
    private Hasta hasta;
    
    //OneToMany
    private Sekreter sekreter;
    

    public Randevu() {
    }

    public Randevu(int randevu_id, int randevu_no, Date tarih) {
        this.randevu_id = randevu_id;
        this.randevu_no = randevu_no;
        this.tarih = tarih;
    }

    public int getRandevu_id() {
        return randevu_id;
    }

    public void setRandevu_id(int randevu_id) {
        this.randevu_id = randevu_id;
    }

    public int getRandevu_no() {
        return randevu_no;
    }

    public void setRandevu_no(int randevu_no) {
        this.randevu_no = randevu_no;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    
    
}
