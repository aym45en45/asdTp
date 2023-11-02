public class Etudiant {
    String nom;
    float note;
    int qrp;
    public Etudiant(String nom, float note, int qrp) {
        this.nom = nom;
        this.note = note;
        this.qrp = qrp;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public float getNote() {
        return note;
    }
    public void setNote(float note) {
        this.note = note;
    }
    public int getQrp() {
        return qrp;
    }
    public void setQrp(int qrp) {
        this.qrp = qrp;
    }
    
}
