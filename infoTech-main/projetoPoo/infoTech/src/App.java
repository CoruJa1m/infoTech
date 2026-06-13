import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static List<Equipamento> equipamentos = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n=============== INFO TECH ================");
            System.out.println("1 - Cadastrar Equipamento");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Listar Equipamentos");
            System.out.println("4 - Listar Clientes");
            System.out.println("5 - Editar Cliente");
            System.out.println("6 - Remover Cliente");
            System.out.println("7 - Buscar Cliente");
            System.out.println("8 - Sair");
            System.out.println("==========================================");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarEquipamento(sc);
                    break;

                case 2:
                    cadastrarCliente(sc);
                    break;

                case 3:
                    System.out.println("\n=== EQUIPAMENTOS CADASTRADOS ===");
                    for (Equipamento eq : equipamentos) {
                        System.out.println(
                            "- " + eq.getNomeEquip()
                            + " (" + eq.getModeloEquip() + ")"
                            + " - Problema: " + eq.getProblematEquip()
                            + " - Data: " + eq.getDataChegada()
                        );
                    }
                    break;

                case 4:
                    System.out.println("\n=== CLIENTES CADASTRADOS ===");
                    for (Cliente cl : clientes) {
                        System.out.println(
                            "- " + cl.getNome()
                            + " | CPF: " + cl.getCpf()
                            + " | Telefone: " + cl.getTelefone()
                        );
                    }
                    break;

                case 5:
                    Cliente clienteEditado = editarCliente(sc);

                    if (clienteEditado != null) {
                        System.out.println("Cliente editado com sucesso!");
                    }
                    break;

                case 6:
                    removerCliente(sc);
                    break;


                case 7:
                   buscarCliente(sc);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 8);

        sc.close();
    }

    private static Equipamento cadastrarEquipamento(Scanner sc) {

        Equipamento equipamento = new Equipamento();

        System.out.print("Nome do equipamento: ");
        equipamento.setNomeEquip(sc.nextLine());

        System.out.print("Modelo: ");
        equipamento.setModeloEquip(sc.nextLine());

        System.out.print("Data de chegada (AAAA-MM-DD): ");
        equipamento.setDataChegada(Date.valueOf(sc.nextLine()));

        System.out.print("Problema do equipamento: ");
        equipamento.setProblematEquip(sc.nextLine());

        equipamentos.add(equipamento);

        System.out.println("Equipamento cadastrado com sucesso!");

        return equipamento;
    }

    private static Cliente cadastrarCliente(Scanner sc) {

        Cliente cliente = new Cliente();

        System.out.println("\n=== CADASTRO DO CLIENTE ===");

        System.out.print("Nome: ");
        cliente.setNome(sc.nextLine());

        System.out.print("CPF: ");
        cliente.setCpf(sc.nextLine());

        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        cliente.setDataNascimento(Date.valueOf(sc.nextLine()));

        System.out.print("Telefone: ");
        cliente.setTelefone(sc.nextLine());

        System.out.print("Cidade: ");
        cliente.setCidade(sc.nextLine());

        System.out.print("Estado: ");
        cliente.setEstado(sc.nextLine());

        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");

        return cliente;
    }

    private static Cliente editarCliente(Scanner sc) {

        System.out.print("Digite o CPF do cliente que deseja editar: ");
        String cpf = sc.nextLine();

        for (Cliente cliente : clientes) {

            if (cliente.getCpf().equals(cpf)) {

                System.out.println("Cliente encontrado: " + cliente.getNome());

                System.out.print("Novo nome (Enter para manter): ");
                String novoNome = sc.nextLine();

                if (!novoNome.isEmpty()) {
                    cliente.setNome(novoNome);
                }

                System.out.print("Novo telefone (Enter para manter): ");
                String novoTelefone = sc.nextLine();

                if (!novoTelefone.isEmpty()) {
                    cliente.setTelefone(novoTelefone);
                }

                System.out.print("Nova cidade (Enter para manter): ");
                String novaCidade = sc.nextLine();

                if (!novaCidade.isEmpty()) {
                    cliente.setCidade(novaCidade);
                }

                System.out.print("Novo estado (Enter para manter): ");
                String novoEstado = sc.nextLine();

                if (!novoEstado.isEmpty()) {
                    cliente.setEstado(novoEstado);
                }

                return cliente;
            }
        }

        System.out.println("Cliente não encontrado.");
        return null;
    }

    private static void removerCliente(Scanner sc) {

        System.out.print("Digite o CPF do cliente que deseja remover: ");
        String cpf = sc.nextLine();

        Cliente clienteRemover = null;

        for (Cliente cliente : clientes) {

            if (cliente.getCpf().equals(cpf)) {
                clienteRemover = cliente;
                break;
            }
        }

        if (clienteRemover != null) {

            System.out.println("Cliente encontrado: " + clienteRemover.getNome());

            System.out.print("Tem certeza que deseja remover? (S/N): ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                clientes.remove(clienteRemover);
                System.out.println("Cliente removido com sucesso!");
            } else {
                System.out.println("Remoção cancelada.");
            }

        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    
    
   private static void buscarCliente(Scanner sc) {

    System.out.print("Digite o CPF do cliente que deseja buscar: ");
    String cpf = sc.nextLine();

    for (Cliente cliente : clientes) {
        if (cliente.getCpf().equals(cpf)) {

            System.out.println("\n======== CLIENTE ENCONTRADO ========");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Cidade: " + cliente.getCidade());
            System.out.println("Estado: " + cliente.getEstado());

            return;
        }
    }

    System.out.println("Cliente não encontrado.");
  } 

}