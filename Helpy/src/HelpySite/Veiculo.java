package HelpySite;

public class Veiculo {
    private ModeloCarro modelo;
    private Fabricante fabricante;
    private int ano;
    private Motor motor;
    private Transmissao transmissao;


    public ModeloCarro getModelo() {
        return modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }


    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    private Caracteristicas caracteristicas;


    public void setModelo(ModeloCarro modelo) {
    }

    public void setFabricante(Fabricante fabricante) {
    }

    public void setAno(int i) {
    }

    public void setTransmissao(Transmissao transmissao) {
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
    }
}
