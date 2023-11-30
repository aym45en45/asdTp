public class ComplexeTab extends Complexe {
    float tab[];

    public ComplexeTab(float rl, float img) {
        tab=new float[] {rl,img};
    }
    @Override
    public Complexe makeC(float rl, float img){
        return new ComplexeTab(rl, img);
    }

    @Override
    public float rl() {
        return tab[0];
    }

    @Override
    public float img() {
        return tab[1];
    }
}
