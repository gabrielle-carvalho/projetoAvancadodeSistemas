package AV1.exemplos_conceitos;

public class Main {
    public static void main(String[] args) {
        // O objeto instanciado é específico, mas a referência é da superclasse
        Letra c = new Consoante();[cite: 2]
        Letra v = new Vogal();[cite: 2]

        Letra.imprimeLetra(c);[cite: 2]
        Letra.imprimeLetra(v);[cite: 2]
    }
}
