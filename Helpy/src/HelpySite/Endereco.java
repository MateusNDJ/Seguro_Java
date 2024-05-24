package HelpySite;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    // Método getter para a rua
    public String getRua() {
        return rua;
    }

    // Método setter para a rua
    public void setRua(String rua) {
        this.rua = rua;
    }

    // Método getter para a cidade
    public String getCidade() {
        return cidade;
    }

    // Método setter para a cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método getter para o estado
    public String getEstado() {
        return estado;
    }

    // Método setter para o estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método getter para o cep
    public String getCep() {
        return cep;
    }

    // Método setter para o cep
    public void setCep(String cep) {
        this.cep = cep;
    }
}

