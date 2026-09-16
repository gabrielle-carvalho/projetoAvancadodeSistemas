public abstract class Letra {
    // Método abstrato que obriga as subclasses a implementarem sua própria versão
    abstract String Imprime(); 

    // Polimorfismo: O método recebe qualquer objeto que seja uma "Letra"
    public static void imprimeLetra(Letra l) {
        System.out.println(l.Imprime());[cite: 2]
    }
}