public abstract class Complexe {

    public void AfficherSomme(Complexe c1) {
        System.err.println("la somme " + somme(c1, this).rl() + " + " + somme(c1, this).img() + "i");
    }

    public void AfficherSoustraction(Complexe c1) {
        System.out.println("La soustraction " + soustraction(c1, this).rl() + " + " + soustraction(c1, this).img() + "i");
    }

    public Complexe somme(Complexe c1, Complexe c2) {
        float rl = c1.rl() + c2.rl();
        float img = c1.img() + c2.img();
        return makeC(rl, img);
    }

    public Complexe soustraction(Complexe c1, Complexe c2) {
        float rl = c1.rl() - c2.rl();
        float img = c1.img() - c2.img();
        return makeC(rl, img);
    }

    private double m(Complexe c) {
        return Math.sqrt(c.rl() * c.rl() + c.img() * c.img());
    }

    public void mudel(Complexe c1) {
        if (m(c1) > m(this))
            System.err.println("le plus grand est " + c1.rl() + " + " + c1.img());
        else
            System.err.println("le plus grand est " + this.rl() + " + " + this.img());

    }

    public abstract Complexe makeC(float rl, float img);

    public abstract float rl();

    public abstract float img();
}
