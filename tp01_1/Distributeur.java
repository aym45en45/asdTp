public class Distributeur {
    private int choix;

public Boisson selection(int choix){
    setChoix(choix);
    if(choix == 1){
        return new Boisson("Café", 50); }
    else if (choix == 2){
        return new Boisson("Thé", 40); }
    else {
        return new Boisson("Lait", 30); }
    }

    public int monnaie(int dinars){
        return dinars;
    }

    public int getChoix() {
        return choix;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }
}