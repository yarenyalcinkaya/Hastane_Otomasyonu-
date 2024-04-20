
package Entity;

import java.util.List;


public  class Bolum {
    private int bolum_id;
    private String isim;
    
    //OneToOne
    private Bashekim bashekim;
    
    //OneToMany
    private List<Doktor> doktorlar;
    

    public Bolum() {
    }

    public Bolum(int bolum_id, String isim) {
        this.bolum_id = bolum_id;
        this.isim = isim;
    }

    public int getBolum_id() {
        return bolum_id;
    }

    public void setBolum_id(int bolum_id) {
        this.bolum_id = bolum_id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    
}
