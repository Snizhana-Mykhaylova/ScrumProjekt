package model.tables;

public class dozenten {

    private int dozentId;
    private String dozentVorname;
    private String dozentNachname;
    private String dozentFachgebiet;


    public dozenten() {
    }

    public dozenten(int dozentId, String dozentVorname, String dozentNachname, String dozentFachgebiet) {
        this.dozentId = dozentId;
        this.dozentVorname = dozentVorname;
        this.dozentNachname = dozentNachname;
        this.dozentFachgebiet = dozentFachgebiet;
    }


    public int getDozentId() {
        return this.dozentId;
    }

    public void setDozentId(int dozentId) {
        this.dozentId = dozentId;
    }

    public String getDozentVorname() {
        return this.dozentVorname;
    }

    public void setDozentVorname(String dozentVorname) {
        this.dozentVorname = dozentVorname;
    }

    public String getDozentNachname() {
        return this.dozentNachname;
    }

    public void setDozentNachname(String dozentNachname) {
        this.dozentNachname = dozentNachname;
    }

    public String getDozentFachgebiet() {
        return this.dozentFachgebiet;
    }

    public void setDozentFachgebiet(String dozentFachgebiet) {
        this.dozentFachgebiet = dozentFachgebiet;
    }

}
