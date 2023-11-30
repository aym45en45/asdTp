public abstract class Complexe {

    public static void AfficherSomme(ComplexeTab c1, ComplexeTab c2) {
        System.err.println("la somme " + somme(c1, c2).rl() + " + " + somme(c1, c2).img() + "i");
    }

    public static void AfficherSoustraction(ComplexeTab c1, ComplexeTab c2) {
        System.out.println("La soustraction " + soustraction(c1, c2).rl() + " + " + soustraction(c1, c2).img() + "i");
    }

    public static Complexe somme(ComplexeTab c1, ComplexeTab c2) {
        float rl = c1.rl() + c2.rl();
        float img = c1.img() + c2.img();
        return c1.makeC(rl, img);
    }

    public static Complexe soustraction(ComplexeTab c1, ComplexeTab c2) {
        float rl = c1.rl() - c2.rl();
        float img = c1.img() - c2.img();
        return c1.makeC(rl, img);
    }

    private static double m(ComplexeTab c) {
        return Math.sqrt(c.rl() * c.rl() + c.img() * c.img());
    }

    public static void mudel(ComplexeTab c1, ComplexeTab c2) {
        if (m(c1) > m(c2))
            System.err.println("le plus grand est " + c1.rl() + " + " + c1.img());
        else
            System.err.println("le plus grand est " + c2.rl() + " + " + c2.img());

    }

    public abstract Complexe makeC(float rl, float img);

    public abstract float rl();

    public abstract float img();
}
