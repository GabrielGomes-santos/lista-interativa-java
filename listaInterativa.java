import java.io.Console;
import java.util.ArrayList;

public class listaInterativa {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        // abrimos o Arraylist para criar uma lista de tarefas, 
        // que vai ser em String e ativamos ele com o "New Array".

       Console console = System.console();

        String adicionarNovaTarefa = "s";
        // Estamos criando uma condição de que para adicionar uma 
        // tarefa vai precisar ser SIM (s).

        while (adicionarNovaTarefa.equals("s")) {
        // While = Enquanto. Entao enquanto for igual (.equals) a SIM (s)
        
        //tipos de referecia se usa ".equals" e "==" serve para objetos primitivos.
        System.out.println("====== Informe a tarefa =======");
        String tarefa = console.readLine();
        tarefas.add(tarefa);

        System.out.println("Adicionar nova tarefa (s ou n)?");
        adicionarNovaTarefa = console.readLine();

        System.out.println("\nSuas Tarefas: ");
        for (int i = 0; i < tarefas.size(); i++) {
          System.out.println("( )" + tarefas.get(i));  
        }
            // o I vale 0 ; enquanto I for menor que o tamanho de tarefas ; adiciona 1.

        }
    }
}
