import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

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
                    converter();
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

    public void converter(){
        try (FileWriter fw = new FileWriter("TO-DO.txt");
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(lista);
            System.out.println("Arquivo salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public void mostrarLista(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("- " + lista.get(i));
        }
    }
}
