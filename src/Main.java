import classes.Checklistitem;
import classes.Tarefa;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.print("Descrição: ");
        t.setDescricao(in.nextLine());
        System.out.println(t.getUuid());
        System.out.println(t.getNome());
        System.out.println(t.getDescricao());
        for(int i = 0; i<10; i++){
            System.out.printf("Item número %d: ",i+1);
            System.out.print("Descrição: ");

            System.out.print("Deseja informar mais itens?(S/N): ");
            if(in.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
