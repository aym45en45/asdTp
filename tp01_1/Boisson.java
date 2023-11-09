public class Boisson {
    private String nom;
    private int prix;

    public Boisson() {
    }

    public Boisson(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }
    public Boisson(String nom) {
        this.nom = nom;
        this.prix = 0;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
