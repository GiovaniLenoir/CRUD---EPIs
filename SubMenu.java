import java.util.ArrayList;
import java.util.Scanner;

public class SubMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void Menu (String nomeModulo, ArrayList<String> Lista, ArrayList<String> logOperacoes) {
        int opcao;
        do {
            System.out.println("\n ----Modulos " + nomeModulo + "----");
            System.out.println("1. --Cadastrar--");
            System.out.println("2. --Listar--");
            System.out.println("3. --Atualizar--");
            System.out.println("4. --Remover--");
            System.out.println("5. --Voltar--");
            System.out.println("----Escolha uma Opção----");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite seu nome: ");
                    String intem = scanner.nextLine().trim();
                    if (intem.isEmpty()){
                        System.out.println("Cadastro não pode ser nulo. Digite novamente: ");
                    }else {
                        Lista.add(intem);
                        logOperacoes.add(nomeModulo + ": Cadastro = " + intem);
                        System.out.println("Cadastro realizado com sucesso. ");
                    }
                    break;
                    case 2:
                        System.out.println("---Lista de " + nomeModulo + "---");
                        if (Lista.isEmpty()){
                            System.out.println("Nenhum intem cadastrado. ");
                        }else {
                            for (int i = 0; i < Lista.size(); i++){
                                System.out.println(i + " - " + Lista.get(i));
                            }
                        }
                        break;
                    case 3:
                        if (Lista.isEmpty()){
                            System.out.println("Lista está vazia. ");

                        }
                }
            }
        }
    }
}

