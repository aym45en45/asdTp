public class Traitement {
    public void comparer(Etudiant a, Etudiant b, Etudiant c){
    if (a.note > b.note) {
            c.setNom(a.getNom());
            c.setNote(a.getNote());
            c.setQrp(a.getQrp());
        } else {
            c.setNom(b.getNom());
            c.setNote(b.getNote());
            c.setQrp(b.getQrp());
        }
  }
    public void admis(Etudiant e, boolean res){
        if(e.note>=10)
            res = true;
    }
    public boolean memegroupe(Etudiant a, Etudiant b){
        if(a.qrp==b.qrp)
            return true;
        else
            return false;
    }
}
