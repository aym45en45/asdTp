public class Main {
    public static void main(String[] args) {
        ComplexeTab tabC = new ComplexeTab(3, -9);
        ComplexeTab tabC1 = new ComplexeTab(8, 3);
        Complexe.AfficherSomme(tabC,tabC1);
        Complexe.AfficherSoustraction(tabC,tabC1);
        Complexe.mudel(tabC,tabC1);
    }
}
