import java.util.ArrayList;
import java.util.Scanner;

public class SistemaModular {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> EPIs = new ArrayList<>();
    static ArrayList<String> Funcionarios = new ArrayList<>();
    static ArrayList<String> Emprestimos = new ArrayList<>();
    static ArrayList<String> logOperacoes = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("-----Sistema de Gerenciamento-----");
            System.out.println("1. --Módulo de EPIs--");
            System.out.println("2. --Módulo de Funcionários--");
            System.out.println("3. --Módulo de Empréstimos--");
            System.out.println("0. Sair ");
            System.out.println("Escolha uma Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    new SubMenu.Menu(crudEPI, EPIs, logOperacoes);
                    break;
                case 2:
                    new SubMenu.Menu(Funcionarios, usuarioEPI, logOperacoes);
                    break;
                case 3:
                    new SubMenu.Menu(Emprestimos, emprestimoEPI, logOperacoes);
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }while (opcao != 0);

        System.out.println("---Log de Operações---");
        for (String log : logOperacoes) {
            System.out.println(log);
        }
    }


}






