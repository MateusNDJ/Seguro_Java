package HelpySite;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Seguro {
    private Cliente cliente;
    private Veiculo veiculo;
    private String tipoCobertura;
    private double custo;
    private Date periodoValidade;

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

    // Método getter para o tipoCobertura
    public String getTipoCobertura() {
        return tipoCobertura;
    }

    // Método setter para o tipoCobertura
    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    // Método getter para o custo
    public double getCusto() {
        return custo;
    }

    // Método setter para o custo
    public void setCusto(double custo) {
        this.custo = custo;
    }

    // Método getter para o periodoValidade
    public Date getPeriodoValidade() {
        return periodoValidade;
    }

    // Método setter para o periodoValidade
    public void setPeriodoValidade(Date periodoValidade) {
        this.periodoValidade = periodoValidade;
    }

    public void calcularCustoTotal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cobertura (Cobertura Completa ou Outro):");
        this.tipoCobertura = scanner.nextLine();

        System.out.println("Digite o custo base do seguro:");
        this.custo = scanner.nextDouble();

        double custoTotal = 0.0;
        if (this.tipoCobertura.equals("Cobertura Completa")) {
            custoTotal = this.custo * 1.2;
        } else {
            custoTotal = this.custo;
        }
        System.out.println("O custo total do seguro é: " + custoTotal + ";");
    }
}
