import java.util.ArrayList;
import java.util.Scanner;

public class SubmenuCRUD {

    public static void executar(ArrayList<String> lista, String nomeModulo, ArrayList<String> log, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- Submenu " + nomeModulo + " ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Atualizar");
            System.out.println("4. Remover");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite os dados para cadastrar (ex: 'Capacete - 20 unidades - Proteção para a cabeça'): ");
                    String novo = scanner.nextLine().trim();
                    while (novo.isEmpty()) {
                        System.out.print("Entrada vazia! Tente novamente: ");
                        novo = scanner.nextLine().trim();
                    }
                    lista.add(novo);
                    log.add("Cadastrado em " + nomeModulo + ": " + novo);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("--- Lista de " + nomeModulo + " ---");
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum item cadastrado.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia. Nada para atualizar.");
                        break;
                    }
                    System.out.print("Digite o índice do item a atualizar: ");
                    int idxAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    if (idxAtualizar >= 0 && idxAtualizar < lista.size()) {
                        System.out.print("Digite o novo valor: ");
                        String atualizado = scanner.nextLine().trim();
                        while (atualizado.isEmpty()) {
                            System.out.print("Entrada vazia! Tente novamente: ");
                            atualizado = scanner.nextLine().trim();
                        }
                        log.add("Atualizado em " + nomeModulo + ": " + lista.get(idxAtualizar) + " -> " + atualizado);
                        lista.set(idxAtualizar, atualizado);
                        System.out.println("Item atualizado com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia. Nada para remover.");
                        break;
                    }
                    System.out.print("Digite o índice do item a remover: ");
                    int idxRemover = scanner.nextInt();
                    scanner.nextLine();
                    if (idxRemover >= 0 && idxRemover < lista.size()) {
                        log.add("Removido de " + nomeModulo + ": " + lista.get(idxRemover));
                        lista.remove(idxRemover);
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}


