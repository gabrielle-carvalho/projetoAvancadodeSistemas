package fib;
public interface IF_Contato {
  String getNome(); String getTelefone();
  void setNome(String nome); void setTelefone(String telefone);
}
class Contato implements IF_Contato {
  // atributos, métodos, equals e toString
  

}
class MainTesteContato {
  public static void main(String[] args) {
    IF_Contato c = new Contato();
    c.setNome("Eduardo");
    c.setTelefone("71999999999");
    System.out.println(c);
  }
}