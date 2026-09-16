import java.util.ArrayList;
import java.util.List;

public class AgendaList {

    public static void main(String[] args) {

        List<String> contatos = new ArrayList<>(); // List é a interface e ArrayList é a implementação

        contatos.add("Ana"); // add sempre no fim da lista
        contatos.add("João");
        contatos.add("Maria");

        System.out.println("Contatos: " + contatos);

        System.out.println("Primeiro contato: " + contatos.get(0));

        System.out.println("Quantidade: " + contatos.size());

        if (contatos.contains("Maria")) { // verifica se um elemento existe na lista
            System.out.println("Maria está na agenda.");
        }

        contatos.set(1, "Carlos"); // substitui um elemento em determinada posição

        System.out.println("Depois da alteração: " + contatos);

        contatos.remove(0); // remove  elemento pelo índice

        System.out.println("Depois da remoção: " + contatos);

        System.out.println("\nPercorrendo a lista:");

        for (String contato : contatos) {
            System.out.println(contato);
        }
    }
}

