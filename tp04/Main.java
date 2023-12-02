public class Main {
    public static void main(String[] args) {
        ComplexeTab tabC = new ComplexeTab(3, -9);
        ComplexeTab tabC1 = new ComplexeTab(8, 3);
        tabC.AfficherSomme(tabC1);
        tabC.AfficherSoustraction(tabC1);
        tabC.mudel(tabC1);
    }
}
