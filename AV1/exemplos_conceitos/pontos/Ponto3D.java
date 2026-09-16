public class Ponto3D extends Ponto {
    int z; // Dados encapsulados[cite: 2]

    // Construtor recebendo parâmetros
    public Ponto3D(int x, int y, int z) {
        super(x, y); // Chama o construtor da classe Ponto[cite: 2]
        this.z = z;  // this refere-se ao objeto corrente[cite: 2]
    }

    public void setZ(int z) {
        this.z = z;[cite: 2]
    }

    public int getZ() {
        return this.z;[cite: 2]
    }

    // Sobrescrita (Overriding) do método padrão do Java
    public String toString() {
        // Automaticamente chamado ao imprimir a referência do objeto[cite: 2]
        return "Ponto3D X=" + this.getX() + 
               " Y=" + this.getY() + " Z=" + this.getZ();[cite: 2]
    }
    
    public static void main(String[] args) {
        Ponto3D p = new Ponto3D(10, 20, 30);
        // O comando abaixo é o mesmo que chamar p.toString()[cite: 2]
        System.out.println(p); 
    }
}