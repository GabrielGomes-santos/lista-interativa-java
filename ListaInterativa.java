import java.util.ArrayList;
import java.util.Scanner;

public class ListaInterativa {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> tarefas = new ArrayList<>();
        
        String opcao = "s";

        System.out.println("=========================================");
        System.out.println("        GERENCIADOR DE TAREFAS           ");
        System.out.println("=========================================\n");
        
        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Informe a descrição da tarefa: ");
            String tarefa = scanner.nextLine().trim();

            
            if (!tarefa.isEmpty()) {
                tarefas.add(tarefa);
                System.out.println("✔ Tarefa adicionada com sucesso!");
            } else {
                System.out.println(" Tarefa vazia não foi adicionada.");
            }

            System.out.print("\nDeseja adicionar outra tarefa? (s/n): ");
            opcao = scanner.nextLine().trim();
            System.out.println("-----------------------------------------");
        }

        System.out.println("\n=========================================");
        System.out.println("          SUA LISTA DE TAREFAS           ");
        System.out.println("=========================================");

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa foi cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". [ ] " + tarefas.get(i));
            }
        }

        System.out.println("=========================================")
        
        
        scanner.close();
    }
}
