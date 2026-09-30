import java.util.ArrayList;

public class Salao {
    private int numero;
    private int capacidadeMaxima;
    private String localizacao;
    private String tipo;
    private Organizador organizadorResponsavel;
    private ArrayList<Reserva> listaDeReservas;


    public Salao (int numero, int capacidadeMaxima, String localizacao, String tipo, Organizador organizadorResponsavel) {
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.tipo = tipo;
        this.organizadorResponsavel = organizadorResponsavel;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Organizador getOrganizadorResponsavel() {
        return organizadorResponsavel;
    }

    public void setOrganizadorResponsavel(Organizador organizadorResponsavel) {
        this.organizadorResponsavel = organizadorResponsavel;
    }

    public ArrayList<Reserva> getListaDeReservas() {
        return listaDeReservas;
    }

    public void setListaDeReservas(ArrayList<Reserva> listaDeReservas) {
        this.listaDeReservas = listaDeReservas;
    }

    public void addReserva (Reserva novaReserva) {
        boolean existe = false;
        for(Reserva reservas : listaDeReservas) {
            if (novaReserva.getData().equals(reservas.getData())) {
                if (novaReserva.getHorario().equals(reservas.getHorario())) {
                    existe = true;
                    break;
                }
                System.out.println("Horario ja ocupado");
            }
        }
        if (existe) {
            listaDeReservas.add(novaReserva);
        }
    }
}
