package HelpySite;

import java.util.Date;

 public class HistoricoViagem {
    private Veiculo veiculo;
    private Date data;
    private double distanciaPercorrida;

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

    // Método getter para a distanciaPercorrida
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    // Método setter para a distanciaPercorrida
    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
}

