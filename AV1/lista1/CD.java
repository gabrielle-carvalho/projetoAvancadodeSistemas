public class CD extends MemoriaS {
    public static final int ABERTO = 1;
    public static final int FECHADO = 0;

    private int estado;

    public CD(double newTotal, int newUnidade) {
        super(newTotal, newUnidade);
        this.estado = ABERTO;
    }

    public CD(int newTotal, int newUnidade) {
        super(newTotal, newUnidade);
        this.estado = ABERTO;
    }

    @Override
    public double getPerda() {
        return 0.98;
    }

    @Override
    public double getEspacoDisponivelRealKB() {
        return getEspacoDisponivelKB() * getPerda();
    }

    @Override
    public boolean GravaKB(int newTamanho) {
        if (this.estado == ABERTO) {
            boolean gravou = super.GravaKB(newTamanho);
            if (gravou) {
                this.estado = FECHADO;
            }
            return gravou;
        }
        return false;
    }

    public String getEstado() {
        return (this.estado == ABERTO) ? "ABERTO" : "FECHADO";
    }

    @Override
    public String toString() {
        return "CD Estado " + getEstado() + " " + super.toString();
    }
}
