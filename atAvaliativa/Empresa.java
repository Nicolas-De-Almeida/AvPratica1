public class Empresa {
    public static void main(String[] args) {

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
            System.out.println("3)Reservar Salao");
            System.out.println("4)Exibir Informacoes");
            System.out.println("5)Buscar reservas");
            System.out.println("6)Exibir detalhes");
        }
    }
}
