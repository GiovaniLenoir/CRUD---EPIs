import java.util.ArrayList;
import java.util.Scanner;

public class SistemaModular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> epis = new ArrayList<>();
        ArrayList<String> funcionarios = new ArrayList<>();
        ArrayList<String> emprestimos = new ArrayList<>();
        ArrayList<String> log = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== Sistema de Gerenciamento ===");
            System.out.println("1. Módulo de EPIs");
            System.out.println("2. Módulo de Funcionários");
            System.out.println("3. Módulo de Empréstimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    SubmenuCRUD.executar(epis, "EPIs", log, scanner);
                    break;
                case 2:
                    SubmenuCRUD.executar(funcionarios, "Funcionários", log, scanner);
                    break;
                case 3:
                    SubmenuCRUD.executar(emprestimos, "Empréstimos", log, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        System.out.println("\n=== Log de Operações ===");
        for (String entrada : log) {
            System.out.println(entrada);
        }

        scanner.close();
    }
}
