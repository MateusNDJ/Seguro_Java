package HelpySite;
public class Cliente {
    private String nome;
    private Endereco endereco;
    private Contato contato;

    // Método getter para o nome
    public String getNome() {
        return nome;
    }

    // Método setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o endereco
    public Endereco getEndereco() {
        return endereco;
    }

    // Método setter para o endereco
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método getter para o contato
    public Contato getContato() {
        return contato;
    }

    // Método setter para o contato
    public void setContato(Contato contato) {
        this.contato = contato;
    }
}

