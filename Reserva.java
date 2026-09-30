import java.time.LocalDate;

public class Reserva {
    private int codigo;
    private String nomeCliente;
    private LocalDate data;
    private String horario;
    private int quantidadeConvidados;
    private String statusReserva;
    private double valor;

    public Reserva (int codigo, String nomeCliente, LocalDate data,  String horario, int quantidadeConvidados, String statusReserva,  double valor) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.horario = horario;
        this.quantidadeConvidados = quantidadeConvidados;
        this.statusReserva = statusReserva;
        this.valor = valor;


    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }
    public int getCodigo() {
        return this.codigo;
    }


    public void setData(LocalDate novaData) {
        this.data = novaData;
    }
    public LocalDate getData() {
        return this.data;
    }


    public void setnomeCliente(String novoNomeCliente) {
        this.nomeCliente = novoNomeCliente;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }


    public void setQuantodadeConvidados(int novaQuantidadeConvidados) {
        this.codigo = novaQuantidadeConvidados;
    }
    public int getQuantidadeConvidados() {
        return this.quantidadeConvidados;
    }


    public void setHorario(String novoHorario) {
        this.horario = novoHorario;
    }
    public String getHorario() {
        return this.horario;
    }


    public void setCodigo(String novoStatusReserva) {
        this.statusReserva = novoStatusReserva;
    }
    public String getStatusReserva() {
        return this.statusReserva;
    }


    public void setValor(int novoValor) {
        this.valor = novoValor;
    }
    public double getValor() {
        return this.valor;
    }


}
