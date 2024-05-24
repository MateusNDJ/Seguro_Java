package HelpySite;

import java.util.Date;

public class Sinistro {
    private Cliente cliente;
    private Veiculo veiculo;
    private Date data;
    private String descricao;

    // Método getter para o cliente
    public Cliente getCliente() {
        return cliente;
    }

    // Método setter para o cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método getter para o veiculo
    public Veiculo getVeiculo() {
        return veiculo;
    }

    // Método setter para o veiculo
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    // Método getter para a data
    public Date getData() {
        return data;
    }

    // Método setter para a data
    public void setData(Date data) {
        this.data = data;
    }

    // Método getter para a descricao
    public String getDescricao() {
        return descricao;
    }

    // Método setter para a descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

