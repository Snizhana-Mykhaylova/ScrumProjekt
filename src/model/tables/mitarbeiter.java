package model.tables;

public class mitarbeiter {

    private int mitarbeiterId;
    private String mitarbeiterVorname;
    private String mitarbeiterNachname;
    private String mitarbeiterPosition;

    
    public mitarbeiter() {
    }

    public mitarbeiter(int mitarbeiterId, String mitarbeiterVorname, String mitarbeiterNachname, String mitarbeiterPosition) {
        this.mitarbeiterId = mitarbeiterId;
        this.mitarbeiterVorname = mitarbeiterVorname;
        this.mitarbeiterNachname = mitarbeiterNachname;
        this.mitarbeiterPosition = mitarbeiterPosition;
    }


    public int getMitarbeiterId() {
        return this.mitarbeiterId;
    }

    public void setMitarbeiterId(int mitarbeiterId) {
        this.mitarbeiterId = mitarbeiterId;
    }

    public String getMitarbeiterVorname() {
        return this.mitarbeiterVorname;
    }

    public void setMitarbeiterVorname(String mitarbeiterVorname) {
        this.mitarbeiterVorname = mitarbeiterVorname;
    }

    public String getMitarbeiterNachname() {
        return this.mitarbeiterNachname;
    }

    public void setMitarbeiterNachname(String mitarbeiterNachname) {
        this.mitarbeiterNachname = mitarbeiterNachname;
    }

    public String getMitarbeiterPosition() {
        return this.mitarbeiterPosition;
    }

    public void setMitarbeiterPosition(String mitarbeiterPosition) {
        this.mitarbeiterPosition = mitarbeiterPosition;
    }

}
