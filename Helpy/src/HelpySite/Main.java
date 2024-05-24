package HelpySite;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("12345-678");

        Contato contato = new Contato();

        Cliente cliente = new Cliente();
        cliente.setNome("Jorginho");
        cliente.setEndereco(endereco);
        cliente.setContato(contato);

        ModeloCarro modelo = new ModeloCarro();
        Fabricante fabricante = new Fabricante();
        Motor motor = new Motor();
        Transmissao transmissao = new Transmissao();

        Caracteristicas caracteristicas = new Caracteristicas();

        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(modelo);
        veiculo.setFabricante(fabricante);
        veiculo.setAno(2020);
        veiculo.setTransmissao(transmissao);
        veiculo.setCaracteristicas(caracteristicas);

        Date data = new Date();

        Pagamento pagamento = new Pagamento();
        pagamento.setCliente(cliente);
        pagamento.setValor(100.0);
        pagamento.setData(data);

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setNomeModelo("Modelo X");
        modeloCarro.setFabricante(fabricante);

        Sinistro sinistro = new Sinistro();
        sinistro.setCliente(cliente);
        sinistro.setVeiculo(veiculo);
        sinistro.setData(data);
        sinistro.setDescricao("Descrição do sinistro");

        Manutencao manutencao = new Manutencao();
        manutencao.setVeiculo(veiculo);
        manutencao.setData(data);
        manutencao.setDescricao("Descrição da manutenção");

        Date periodoValidade = new Date();

        Seguro seguro = new Seguro();
        seguro.setCliente(cliente);
        seguro.setVeiculo(veiculo);
        seguro.setTipoCobertura("Cobertura Completa");
        seguro.setCusto(1000.0);
        seguro.setPeriodoValidade(periodoValidade);
        seguro.calcularCustoTotal();
        manutencao.verificarNecessidadeManutencao();

    }
}
