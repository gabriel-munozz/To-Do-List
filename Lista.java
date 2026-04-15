import java.util.Scanner;
import java.util.ArrayList;

public class Lista {
    ArrayList<String> lista = new ArrayList<String>();

    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        
        do{
            System.out.println("*** To Do List ***");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Converter");
            System.out.println("4 - Mostrar lista");
            System.out.println("5 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("O que deseja adicionar: ");
                    String valorLista = entrada.next();
                    adicionar(valorLista);
                    break;
                case 2:
                    System.out.print("O que deseja remover: ");
                    String valorListaRemover = entrada.next();
                    remover(valorListaRemover);
                    break;
                case 3:
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 5:
                    System.out.println("Finalizando sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 5);
    }

    public void adicionar(String valorLista){
        lista.add(valorLista);
        System.out.println("Item adicionado!");
    }

    public void remover(String valorListaRemover){
        lista.remove(valorListaRemover);
        System.out.println("Item removido!");
    }

    /* Metodo converter o que foi escrito para um arquivo .txt */

    public void mostrarLista(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("- " + lista.get(i));
        }
    }
}