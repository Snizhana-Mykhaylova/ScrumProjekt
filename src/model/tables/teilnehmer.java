package model.tables;

public class teilnehmer {

    private int teilnehmerId;
    private String teilnehmerVorname;
    private String teilnehmerNachname;
    private int fkKursId;


    public teilnehmer() {
    }

    public teilnehmer(int teilnehmerId, String teilnehmerVorname, String teilnehmerNachname, int fkKursId) {
        this.teilnehmerId = teilnehmerId;
        this.teilnehmerVorname = teilnehmerVorname;
        this.teilnehmerNachname = teilnehmerNachname;
        this.fkKursId = fkKursId;
    }


    public int getTeilnehmerId() {
        return this.teilnehmerId;
    }

    public void setTeilnehmerId(int teilnehmerId) {
        this.teilnehmerId = teilnehmerId;
    }

    public String getTeilnehmerVorname() {
        return this.teilnehmerVorname;
    }

    public void setTeilnehmerVorname(String teilnehmerVorname) {
        this.teilnehmerVorname = teilnehmerVorname;
    }

    public String getTeilnehmerNachname() {
        return this.teilnehmerNachname;
    }

    public void setTeilnehmerNachname(String teilnehmerNachname) {
        this.teilnehmerNachname = teilnehmerNachname;
    }

    public int getFkKursId() {
        return this.fkKursId;
    }

    public void setFkKursId(int fkKursId) {
        this.fkKursId = fkKursId;
    }
    
}
