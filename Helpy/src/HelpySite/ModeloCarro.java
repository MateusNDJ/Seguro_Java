package HelpySite;

public class ModeloCarro {
    private String nomeModelo;
    private Fabricante fabricante;

    // Método getter para o nomeModelo
    public String getNomeModelo() {
        return nomeModelo;
    }

    // Método setter para o nomeModelo
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    // Método getter para o fabricante
    public Fabricante getFabricante() {
        return fabricante;
    }

    // Método setter para o fabricante
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}

