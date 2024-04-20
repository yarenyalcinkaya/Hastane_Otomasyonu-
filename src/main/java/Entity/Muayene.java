package Entity;


public class Muayene {
    private int muayene_id;
    private int muayene_no;
    
    
    //ManyToOne
    private Doktor doktor;
    
    //OneToMany
    private Hasta hasta;

    public Muayene() {
    }

    public Muayene(int muayene_id, int muayene_no) {
        this.muayene_id = muayene_id;
        this.muayene_no = muayene_no;
    }

    public int getMuayene_id() {
        return muayene_id;
    }

    public void setMuayene_id(int muayene_id) {
        this.muayene_id = muayene_id;
    }

    public int getMuayene_no() {
        return muayene_no;
    }

    public void setMuayene_no(int muayene_no) {
        this.muayene_no = muayene_no;
    }
    
            
}
