public class carros {
    private final String carro;
    private final String numcarro;
    private final String marca;

    private final String placa;

    public carros(String carro, String numcarro, String marca, String placa) {
        this.carro = carro;
        this.numcarro = numcarro;
        this.marca = marca;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\n carros{" +
                "carro='" + carro + '\'' +
                ", numcarro='" + numcarro + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
