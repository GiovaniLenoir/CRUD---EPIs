import java.util.ArrayList;
import java.util.Scanner;

public class SubMenu {
    static Scanner scanner = new Scanner(System.in);

    public SubMenu(ArrayList<String> Lista, String nomeModulo {
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
                    String entrada = scanner.nextLine();
                    if (!entrada.isBlank()) ;
                    Lista.add(entrada);
                    System.out.println("Cadastro realizado com sucesso!");
                    SistemaModular.logOperacoes.add("[" + nomeModulo + " Cadastro: " + entrada);
                }
            }
        }
    }
}

