import java.time.LocalDate;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner();
        Organizador organizador1 = new Organizador("Junin", 123, 1234, "Sla1");
        Organizador organizador2 = new Organizador("Cleitin", 123, 1234, "Sla2");
        Organizador organizador3 = new Organizador("Flavin", 123, 1234, "Sla3");

        Salao salao1 = new Salao(123, 35, "centro", "Laboratorio", organizador1);
        Salao salao2 = new Salao(143, 45, "centro", "Pesquisa", organizador2);
        Salao salao3 = new Salao(163, 65, "centro", "Recepcao", organizador3);

        while (true) {
            System.out.println("Bem-vindo");
            System.out.println("1)Cadastrar reserva");
            System.out.println("2)Associar um organizador");
            System.out.println("3)Atribuir reserva");
            System.out.println("4)Exibir reserva de um salao");
            System.out.println("5)Infomar quantidade de reservas");
            System.out.println("5)Buscar reservas");
            System.out.println("6)Exibir detalhes");
        }
        System.out.println("Digite o numero da opcao: ");
        int resposta = entrada.nextInt();
        if(resposta == 1) {
            System.out.println("Codigo");
            int codigo = entrada.nextInt();
            System.out.println("Nome");
            String nomeCliente = entrada.next();
            System.out.println("Data");
            LocalDate data = entrada.next();
            System.out.println("Horario");
            String horario = entrada.next();
            System.out.println("Quantidade convidados");
            int quantidadeConvidados = entrada.nextInt();
            System.out.println("Status");
            String statusReserva = entrada.next();
            System.out.println("Valor");
            double valor = entrada.nextInt();
            Reserva novaReserva = new Reserva(codigo, nomeCliente, data, horario, quantidadeConvidados, statusReserva, valor);
        }else if(resposta == 2) {
            
        }else if(resposta == 3) {
            
        }else if(resposta == 4) {
            
        }else if(resposta == 5) {
            
        }else if(resposta == 6) {
            
        }else if(resposta == 7) {
            
        }
    }
}
