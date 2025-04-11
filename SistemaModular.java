import java.util.ArrayList;
import java.util.Scanner;

public class SistemaModular {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> logInfo = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> EPIs = new ArrayList<>();
        ArrayList<String> Funcionarios = new ArrayList<>();
        ArrayList<String> Emprestimos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("-----Sistema de Gerenciamento-----");
            System.out.println("1. --Módulo de EPIs--");
            System.out.println("2. --Módulo de Funcionários--");
            System.out.println("3. --Módulo de Empréstimos--");
            System.out.println("0. Sair ");
            System.out.println("Escolha uma Opção: ");
            int opcao = crudEPI.input.nextInt();
            crudEPI.input.nextLine();

            switch (opcao) {
                case 1:
                    SubMenu(crudEPI, crudEPI.epis);
                break;
                case 2:
                    SubMenu(usuarioEPI, usuarioEPI.Usuarios);
                break;
                case 3:
                    SubMenu(emprestimoEPI, emprestimoEPI.EmprestimoEPI);
                break;
                case 0:
                    System.out.println("Encerranso Sistema...");
                break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }while (opcao != 0);
    }


}


