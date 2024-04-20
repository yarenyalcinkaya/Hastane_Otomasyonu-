
package Entity;

public class Kardiyolog extends Doktor {

    public Kardiyolog() {
    }

    public Kardiyolog(int doktor_id, String ad, String soyad, String unvan) {
        super(doktor_id, ad, soyad, unvan);
    }

    @Override
    public void setUnvan(String unvan) {
        super.setUnvan(unvan); 
    }

    @Override
    public String getUnvan() {
        return super.getUnvan(); 
    }

    @Override
    public void setSoyad(String soyad) {
        super.setSoyad(soyad); 
    }

    @Override
    public String getSoyad() {
        return super.getSoyad(); 
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad); 
    }

    @Override
    public String getAd() {
        return super.getAd(); 
    }

    @Override
    public void setDoktor_id(int doktor_id) {
        super.setDoktor_id(doktor_id); 
    }

    @Override
    public int getDoktor_id() {
        return super.getDoktor_id(); 
    }
    
}
