import java.util.HashMap;
import java.util.Map;

public class AgendaMap {

    public static void main(String[] args) {

        Map<String, String> contatos = new HashMap<>();

        contatos.put("1111-1111", "Ana");
        contatos.put("2222-2222", "João");
        contatos.put("3333-3333", "Maria");

        // as pesquisas em um Map são feitas através da chave, e não do índice como em uma lista
        // as chaves devem ser únicas, mas os valores podem se repetir

        // Exibe todo o Map
        System.out.println("Contatos: " + contatos);

        String nome = contatos.get("2222-2222");

        System.out.println("Contato encontrado: " + nome);

        // containsKey() verifica se uma determinada chave existe
        if (contatos.containsKey("1111-1111")) {
            System.out.println("O telefone está cadastrado.");
        }

        // containsValue() verifica se determinado valor existe
        if (contatos.containsValue("Maria")) {
            System.out.println("Maria está na agenda.");
        }

        contatos.put("2222-2222", "Carlos");

        System.out.println("Depois da alteração: " + contatos);

        contatos.remove("3333-3333");

        System.out.println("Depois da remoção: " + contatos);

        System.out.println("Quantidade de contatos: " + contatos.size());

        System.out.println("\nPercorrendo as chaves:");
        for (String telefone : contatos.keySet()) { // percorrer as chaves usando keySet()
            String nomeContato = contatos.get(telefone); // Para cada telefone, pega o nome associado

            System.out.println(
                "Telefone: " + telefone +
                " | Nome: " + nomeContato
            );
        }
    }
}
