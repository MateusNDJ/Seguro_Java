package HelpySite;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Manutencao {
    private Veiculo veiculo;
    private Date data;
    private String descricao;

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

    public void verificarNecessidadeManutencao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data da última manutenção no formato dd/MM/yyyy:");
        String dataManutencao = scanner.nextLine();

        // Converte a data de String para Date
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.data = formato.parse(dataManutencao);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date hoje = new Date();
        long diferencaEmMilissegundos = hoje.getTime() - this.data.getTime();
        long diferencaEmDias = diferencaEmMilissegundos / (1000 * 60 * 60 * 24);
        if (diferencaEmDias > 365) {
            System.out.println("Manutenção do veículo necessária.");
        } else {
            System.out.println("Manutenção do veículo não é necessária.");
        }
    }
}
