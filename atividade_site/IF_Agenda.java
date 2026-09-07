package fib;
import java.util.*;

public interface IF_Agenda {
    IF_Contato getContato(String telefone);
    boolean adicionaContato(IF_Contato contato);
    boolean removeContato(String telefone);
    Collection<IF_Contato> getListaAgenda();
}

class AgendaMap implements IF_Agenda {
    private Map<String, IF_Contato> listaContato = new HashMap<String, IF_Contato>();

    @Override
    public IF_Contato getContato(String telefone) {
        return this.listaContato.get(telefone);
    }

    @Override
    public boolean adicionaContato(IF_Contato contato) {
        if (this.listaContato.containsKey(contato.getTelefone())) {
            return false;
        }
        this.listaContato.put(contato.getTelefone(), contato);
        return true;
    }

    @Override
    public boolean removeContato(String telefone) {
        if (this.listaContato.containsKey(telefone)) {
            this.listaContato.remove(telefone);
            return true;
        }
        return false;
    }

    @Override
    public Collection<IF_Contato> getListaAgenda() {
        return this.listaContato.values();
    }

    public Collection<IF_Contato> listaContato() {
        return getListaAgenda();
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        Iterator<IF_Contato> iterator = this.listaContato.values().iterator();

        while (iterator.hasNext()) {
            IF_Contato contato = iterator.next();
            texto.append("Nome: ").append(contato.getNome()).append("\n");
            texto.append("Telefone: ").append(contato.getTelefone()).append("\n\n");
        }

        return texto.toString();
    }
}

class MainTesteAgendaMap {
    public static void main(String[] args) {
        AgendaMap agenda = new AgendaMap();
        IF_Contato[] contatos = new IF_Contato[3];

        contatos[0] = new Contato();
        contatos[0].setNome("A");
        contatos[0].setTelefone("345-2455");
        System.out.println("Adicionando " + contatos[0]);
        agenda.adicionaContato(contatos[0]);

        contatos[1] = new Contato();
        contatos[1].setNome("X");
        contatos[1].setTelefone("234-9085");
        System.out.println("Adicionando " + contatos[1]);
        agenda.adicionaContato(contatos[1]);

        contatos[2] = new Contato();
        contatos[2].setNome("Y");
        contatos[2].setTelefone("8890-19085");
        System.out.println("Adicionando " + contatos[2]);
        agenda.adicionaContato(contatos[2]);

        System.out.println(agenda);
        System.out.println("Localizando 345-2455");
        System.out.println(agenda.getContato("345-2455"));
        System.out.println("Removendo 234-9085");
        agenda.removeContato("234-9085");
        System.out.println(agenda);
    }
}
