package fib;

import java.util.*;

public abstract class Agenda {

    public abstract boolean adicionaContato(IF_Contato contato);
    public abstract boolean removeContato(String telefone);
    public abstract IF_Contato getContato(String telefone);
    
    public abstract Collection getLista(); 

    public IF_Contato[] listaContato() {
        Collection lista = getLista();
        Iterator it = lista.iterator(); 
        IF_Contato[] contatos = new IF_Contato[lista.size()];

        int i = 0;
        while (it.hasNext()) {
            contatos[i] = (IF_Contato) it.next();
            i++;
        }

        return contatos;
    }

    public IF_Contato[] listaContatoIniciais(String iniciais) {
        Iterator it = getLista().iterator();
        ArrayList<IF_Contato> contatos = new ArrayList<>();

        while (it.hasNext()) {
            IF_Contato contato = (IF_Contato) it.next();
            if (contato.getNome().startsWith(iniciais)) {
                contatos.add(contato);
            }
        }

        IF_Contato[] resultado = new IF_Contato[contatos.size()];
        for (int i = 0; i < contatos.size(); i++) {
            resultado[i] = contatos.get(i);
        }

        return resultado;
    }
}

class AgendaList extends Agenda {
    private ArrayList<IF_Contato> listaAgenda = new ArrayList<IF_Contato>();

    private int localizaContato(String telefone) {
        if (telefone == null) {
            return -1;
        }
        for (int i = 0; i < this.listaAgenda.size(); i++) {
            if (this.listaAgenda.get(i).getTelefone().equals(telefone)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public IF_Contato getContato(String telefone) {
        int index = localizaContato(telefone);
        if (index >= 0) {
            return this.listaAgenda.get(index);
        }
        return null;
    }

    @Override
    public boolean adicionaContato(IF_Contato contato) {
        if (contato == null || contato.getTelefone() == null) {
            return false;
        }
        if (localizaContato(contato.getTelefone()) >= 0) {
            return false;
        }
        return this.listaAgenda.add(contato);
    }

    @Override
    public boolean removeContato(String telefone) {
        int index = localizaContato(telefone);
        if (index >= 0) {
            this.listaAgenda.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Collection getLista() {
        return this.listaAgenda;
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        Iterator<IF_Contato> iterator = this.listaAgenda.iterator();
        while (iterator.hasNext()) {
            IF_Contato contato = iterator.next();
            int index = this.listaAgenda.indexOf(contato);
            texto.append("Posição ").append(index).append("\n");
            texto.append("Nome: ").append(contato.getNome()).append("\n");
            texto.append("Telefone: ").append(contato.getTelefone()).append("\n\n");
        }
        return texto.toString();
    }
}

class AgendaMap extends Agenda {
    private HashMap<String, IF_Contato> listaContato = new HashMap<String, IF_Contato>();

    @Override
    public IF_Contato getContato(String telefone) {
        if (telefone == null) {
            return null;
        }
        return this.listaContato.get(telefone);
    }

    @Override
    public boolean adicionaContato(IF_Contato contato) {
        if (contato == null || contato.getTelefone() == null) {
            return false;
        }
        if (this.listaContato.containsKey(contato.getTelefone())) {
            return false;
        }
        this.listaContato.put(contato.getTelefone(), contato);
        return true;
    }

    @Override
    public boolean removeContato(String telefone) {
        if (telefone != null && this.listaContato.containsKey(telefone)) {
            this.listaContato.remove(telefone);
            return true;
        }
        return false;
    }

    @Override
    public Collection getLista() {
        return this.listaContato.values();
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

class MainTesteFabrica {
    public static void main(String[] args) {
        Agenda agenda = FabricaAgenda.getInstancia().criaAgenda(FabricaAgenda.AGENDALIST);
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