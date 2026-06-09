import java.sql.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int opcao = 0;
        while (opcao != 3 ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===============INFO TECH ================");
        System.out.println("1 - Cadastrar Equipamento");
        System.out.println("2 - Cadastro Cliente");
        System.out.println("3 - sair ");
        System.out.println("=========================================");

        opcao = sc.nextInt();
        sc.nextLine();



        
            
        
        switch (opcao) {

            case 1:

            
                Equipamento equipamento = new Equipamento();

                System.out.print("Nome do equipamento: ");
                equipamento.setNomeEquip(sc.nextLine());

                System.out.print("Modelo: ");
                equipamento.setModeloEquip(sc.nextLine());

                System.out.print("Data de chegada (AAAA-MM-DD): ");
                equipamento.setDataChegada(Date.valueOf(sc.nextLine()));

                System.out.print("Problema do equipamento: ");
                equipamento.setProblematEquip(sc.nextLine());

                System.out.println("\n=== DADOS CADASTRADOS ===");
                System.out.println("Equipamento: " + equipamento.getNomeEquip());
                System.out.println("Modelo: " + equipamento.getModeloEquip());
                System.out.println("Data de chegada: " + equipamento.getDataChegada());
                System.out.println("Problema: " + equipamento.getProblematEquip());
                
                   break;

        case 2:

    Cliente cliente = new Cliente();
    System.out.println(" \n===CADASTRO DO CLIENTE ===");
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

    System.out.println("\n=== CLIENTE CADASTRADO ===");
    System.out.println("Nome: " + cliente.getNome());
    System.out.println("CPF: " + cliente.getCpf());
    System.out.println("Telefone: " + cliente.getTelefone());

    break;


case 3:
            System.out.println("ok vou sair bye ");
            
        sc.close();
        break;

        
      }
     }  
  }
}