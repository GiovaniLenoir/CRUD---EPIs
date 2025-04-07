import java.util.Scanner;

    public class SistemaPrincipal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n----- Sistema de Controle -----");
                System.out.println("1. CRUD de Usuários");
                System.out.println("2. CRUD de EPIs");
                System.out.println("3. CRUD de Empréstimos");
                System.out.println("4. CRUD de Devoluções");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1:
                        CRUDUsuario.criarMenu();
                        break;
                    case 2:
                        EPIs.criarMenu();
                        break;
                    case 3:
                        CRUDEmprestimo.criarMenu();
                        break;
                    case 4:
                        CRUDDevolucao.criarMenu();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } while (opcao != 0);
        }
    }


