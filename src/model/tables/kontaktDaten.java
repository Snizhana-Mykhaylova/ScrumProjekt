package model.tables;

public class kontaktDaten {

    private int kdId;
    private String kdOrt;
    private String kdStraße;
    private int kdHausNr;
    private int kdPLZ;
    private String kdEmail;
    private String kdPhoneNr;
    private int fkDozentId;
    private int fkTeilnehmerId;
    private int fkMitarbeiterId;


    public kontaktDaten() {
    }

    public kontaktDaten(int kdId, String kdOrt, String kdStraße, int kdHausNr, int kdPLZ, String kdEmail, String kdPhoneNr, int fkDozentId, int fkTeilnehmerId, int fkMitarbeiterId) {
        this.kdId = kdId;
        this.kdOrt = kdOrt;
        this.kdStraße = kdStraße;
        this.kdHausNr = kdHausNr;
        this.kdPLZ = kdPLZ;
        this.kdEmail = kdEmail;
        this.kdPhoneNr = kdPhoneNr;
        this.fkDozentId = fkDozentId;
        this.fkTeilnehmerId = fkTeilnehmerId;
        this.fkMitarbeiterId = fkMitarbeiterId;
    }


    public int getKdId() {
        return this.kdId;
    }

    public void setKdId(int kdId) {
        this.kdId = kdId;
    }

    public String getKdOrt() {
        return this.kdOrt;
    }

    public void setKdOrt(String kdOrt) {
        this.kdOrt = kdOrt;
    }

    public String getKdStraße() {
        return this.kdStraße;
    }

    public void setKdStraße(String kdStraße) {
        this.kdStraße = kdStraße;
    }

    public int getKdHausNr() {
        return this.kdHausNr;
    }

    public void setKdHausNr(int kdHausNr) {
        this.kdHausNr = kdHausNr;
    }

    public int getKdPLZ() {
        return this.kdPLZ;
    }

    public void setKdPLZ(int kdPLZ) {
        this.kdPLZ = kdPLZ;
    }

    public String getKdEmail() {
        return this.kdEmail;
    }

    public void setKdEmail(String kdEmail) {
        this.kdEmail = kdEmail;
    }

    public String getKdPhoneNr() {
        return this.kdPhoneNr;
    }

    public void setKdPhoneNr(String kdPhoneNr) {
        this.kdPhoneNr = kdPhoneNr;
    }

    public int getFkDozentId() {
        return this.fkDozentId;
    }

    public void setFkDozentId(int fkDozentId) {
        this.fkDozentId = fkDozentId;
    }

    public int getFkTeilnehmerId() {
        return this.fkTeilnehmerId;
    }

    public void setFkTeilnehmerId(int fkTeilnehmerId) {
        this.fkTeilnehmerId = fkTeilnehmerId;
    }

    public int getFkMitarbeiterId() {
        return this.fkMitarbeiterId;
    }

    public void setFkMitarbeiterId(int fkMitarbeiterId) {
        this.fkMitarbeiterId = fkMitarbeiterId;
    }
    
}
