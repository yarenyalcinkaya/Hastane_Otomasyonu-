package Entity;

import java.util.List;


public class Oda {
    private int oda_id;
    private int oda_no;
    
    private List<Hasta> hastalar;
    

    public Oda() {
    }

    public Oda(int oda_id, int oda_no) {
        this.oda_id = oda_id;
        this.oda_no = oda_no;
    }

    public int getOda_id() {
        return oda_id;
    }

    public void setOda_id(int oda_id) {
        this.oda_id = oda_id;
    }

    public int getOda_no() {
        return oda_no;
    }

    public void setOda_no(int oda_no) {
        this.oda_no = oda_no;
    }
    
   
}
