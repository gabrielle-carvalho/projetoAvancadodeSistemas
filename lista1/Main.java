public class Main {
    public static void imprimirHDInfo(MemoriaS hd) {
        if (hd instanceof HD) {
            HD objHD = (HD) hd;
            System.out.println("a) Número de Série: " + objHD.getNumeroSerie() + " | Percentual de Perda: " + objHD.getPerda() + "%");
        }
    }

    public static void imprimirCDEstado(MemoriaS cd) {
        if (cd instanceof CD) {
            CD objCD = (CD) cd;
            System.out.println("b) Estado do CD: " + objCD.getEstado());
        }
    }

    public static void main(String[] args) {
        MemoriaS hd = new HD("46327", 10, MemoriaS.MB);
        MemoriaS cd = new CD(650, MemoriaS.MB);

        // a) Imprima o Número de Série do objeto hd concatenado com o percentual de perda.
        imprimirHDInfo(hd);

        // b) Imprima o estado (ABERTO, FECHADO) do objeto CD.
        imprimirCDEstado(cd);

        // Demonstração adicional de uso / toString
        System.out.println("\n--- Informações dos Objetos ---");
        System.out.println(hd.toString());
        System.out.println(cd.toString());
    }
}
