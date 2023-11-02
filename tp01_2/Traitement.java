public class Traitement {
    public void comparer(Etudiant a, Etudiant b, Etudiant c){
        if(a.note>b.note)
            c=a;
        else
            c=b;
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
