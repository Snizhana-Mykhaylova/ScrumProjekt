package model.tables;

public class kurse {

    private int kursId;
    private String kursName;
    private String kursBeschreibung;
    private String kursStartDatum;
    private String kursEndDatum;
    private int fkDozentId;


    public kurse() {
    }

    public kurse(int kursId, String kursName, String kursBeschreibung, String kursStartDatum, String kursEndDatum, int fkDozentId) {
        this.kursId = kursId;
        this.kursName = kursName;
        this.kursBeschreibung = kursBeschreibung;
        this.kursStartDatum = kursStartDatum;
        this.kursEndDatum = kursEndDatum;
        this.fkDozentId = fkDozentId;
    }


    public int getKursId() {
        return this.kursId;
    }

    public void setKursId(int kursId) {
        this.kursId = kursId;
    }

    public String getKursName() {
        return this.kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public String getKursBeschreibung() {
        return this.kursBeschreibung;
    }

    public void setKursBeschreibung(String kursBeschreibung) {
        this.kursBeschreibung = kursBeschreibung;
    }

    public String getKursStartDatum() {
        return this.kursStartDatum;
    }

    public void setKursStartDatum(String kursStartDatum) {
        this.kursStartDatum = kursStartDatum;
    }

    public String getKursEndDatum() {
        return this.kursEndDatum;
    }

    public void setKursEndDatum(String kursEndDatum) {
        this.kursEndDatum = kursEndDatum;
    }

    public int getFkDozentId() {
        return this.fkDozentId;
    }

    public void setFkDozentId(int fkDozentId) {
        this.fkDozentId = fkDozentId;
    }

}
