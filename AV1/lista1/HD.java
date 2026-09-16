public class HD extends MemoriaS {
    private String numeroSerie;

    public HD(String newNumeroSerie, double newTotal, int newUnidade) {
        super(newTotal, newUnidade);
        this.numeroSerie = newNumeroSerie;
    }

    public HD(String newNumeroSerie, int newTotal, int newUnidade) {
        super(newTotal, newUnidade);
        this.numeroSerie = newNumeroSerie;
    }

    @Override
    public double getPerda() {
        return (getConverteKB(this.total) / 10240.0) / 100.0;
    }

    @Override
    public double getEspacoDisponivelRealKB() {
        return getEspacoDisponivelKB() * (1.0 - getPerda());
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    @Override
    public String toString() {
        return "HD Número de Serie " + this.numeroSerie + " " + super.toString();
    }
}
