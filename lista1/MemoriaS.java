public abstract class MemoriaS {
    public static final int BYTE = 1;
    public static final int KB = 2;
    public static final int MB = 3;
    public static final int GB = 4;
    protected double total;
    protected double utilizadoKB;
    protected int unidade;

    public MemoriaS(double newTotal, int newUnidade) {
        this.total = newTotal;
        this.unidade = newUnidade;
        this.utilizadoKB = 0;
    }

    public MemoriaS(int newTotal, int newUnidade) {
        this((double) newTotal, newUnidade);
    }

    public MemoriaS(double newTotal) {
        this(newTotal, KB);
    }

    public MemoriaS(int newTotal) {
        this((double) newTotal, KB);
    }

    public abstract double getPerda();

    public abstract double getEspacoDisponivelRealKB();

    protected double getEspacoDisponivelKB() {
        return getConverteKB(this.total) - this.utilizadoKB;
    }

    public boolean GravaKB(int newTamanho) {
        if (newTamanho <= getEspacoDisponivelRealKB()) {
            this.utilizadoKB += newTamanho;
            return true;
        }
        return false;
    }

    protected double getConverteKB(double valor) {
        switch (this.unidade) {
            case BYTE:
                return valor / 1024.0;
            case KB:
                return valor;
            case MB:
                return valor * 1024.0;
            case GB:
                return valor * 1024.0 * 1024.0;
            default:
                return valor;
        }
    }

    public String getUnidade() {
        switch (this.unidade) {
            case BYTE:
                return "BYTE";
            case KB:
                return "KB";
            case MB:
                return "MB";
            case GB:
                return "GB";
            default:
                return "DESCONHECIDO";
        }
    }

    public double getPercentualDisponivel() {
        double totalKB = getConverteKB(this.total);
        if (totalKB == 0) return 0.0;
        return (getEspacoDisponivelRealKB() / totalKB) * 100.0;
    }

    @Override
    public String toString() {
        return "Percentual Disponível " + getPercentualDisponivel() + "% Espaço Total " + getConverteKB(this.total) + "KB Espaço Disponível Real " + getEspacoDisponivelRealKB() + "KB Perda " + getPerda() + "%";
    }
}
