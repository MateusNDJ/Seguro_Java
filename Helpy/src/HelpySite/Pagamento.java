package HelpySite;

import java.util.Date;

public class Pagamento {
        private Cliente cliente;
        private double valor;
        private Date data;

        // Método getter para o cliente
        public Cliente getCliente() {
            return cliente;
        }

        // Método setter para o cliente
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        // Método getter para o valor
        public double getValor() {
            return valor;
        }

        // Método setter para o valor
        public void setValor(double valor) {
            this.valor = valor;
        }

        // Método getter para a data
        public Date getData() {
            return data;
        }

        // Método setter para a data
        public void setData(Date data) {
            this.data = data;
        }

    }




