
package Entity;


public class KadınDoğumveHastalıkları extends Doktor{

    public KadınDoğumveHastalıkları() {
    }

    public KadınDoğumveHastalıkları(int doktor_id, String ad, String soyad, String unvan) {
        super(doktor_id, ad, soyad, unvan);
    }

    @Override
    public void setUnvan(String unvan) {
        super.setUnvan(unvan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getUnvan() {
        return super.getUnvan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSoyad(String soyad) {
        super.setSoyad(soyad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getSoyad() {
        return super.getSoyad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAd() {
        return super.getAd(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDoktor_id(int doktor_id) {
        super.setDoktor_id(doktor_id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getDoktor_id() {
        return super.getDoktor_id(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
}
