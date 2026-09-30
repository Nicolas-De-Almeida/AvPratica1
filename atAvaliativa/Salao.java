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
